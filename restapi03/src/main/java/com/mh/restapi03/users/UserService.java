package com.mh.restapi03.users;

import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.LoginException;
import com.mh.restapi03.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(User user){
        List<User> list = userRepository.findAll();
        return list;
    }
    public User regist(User user){

        // 중복처리
        // 해당되는 이메일 있으면 중복처리
        User emailuser = userRepository.findByEmail(user.getEmail());
        if (emailuser != null){
            throw new LoginException(ErrorCode.DUPLICATE);
        }

        //insert 구문 실행
        userRepository.save(user);
        return user;
    }

    public User getUserById(Long id){
        Optional <User> optionalUser = userRepository.findById(id);
        if ( optionalUser.isEmpty()){
         throw new UserException(ErrorCode.NOTFOUND);
        }
        else
            return optionalUser.get();
    }

    public User UpdateUser(User user){

        User EmailUser =userRepository.findByEmail(user.getEmail());
        if (EmailUser == null){
            throw new UserException(ErrorCode.NOTUPDATEEMAIL);
        }

        // update 실행...
        // 시간 비밀번호 이름 변경 기능
        EmailUser.setPassword(user.getPassword());
        EmailUser.setWdate(user.getWdate());
        EmailUser.setUsername(user.getUsername());

        User dbuser = userRepository.save(user);
        return dbuser;
    }


    public User delete(Long id) {
        Optional<User> dbUser = userRepository.findById(id);
        if (dbUser.isEmpty()){
            throw new UserException(ErrorCode.NOTDELETE);
        }

//        userRepository.deleteById(id);

        userRepository.delete(dbUser.get());
        //해당되는 아이디가 있으먄 삭제
        // 없으면 삭제할 이유가 없다.
        return dbUser.get();
    }
    public void deleteAll(){
        userRepository.deleteAll();
    }
}
