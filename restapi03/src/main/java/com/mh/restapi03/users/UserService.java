package com.mh.restapi03.users;

import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.LoginException;
import com.mh.restapi03.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> select(User user){
        List<User> list = userRepository.findAll();
        return list;
    }
    public User regist(User user){
        User emailUser = userRepository.findByEmail(user.getEmail());

        if (emailUser != null){
//            System.out.println(user.getEmail()+"중복된 이메일이 있습니다");
            throw new LoginException(ErrorCode.DUPLICATE);
        }
        userRepository.save(user);
        return user;
    }

    public User getuserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()){
            throw new UserException(ErrorCode.NOTFOUND);
        }
        else
            return optionalUser.get();
    }

    public User UpdateUser(User user){
        User emailUser = userRepository.findByEmail(user.getEmail());
        if (emailUser == null){
            throw new UserException(ErrorCode.NOTUPDATEUSER);
        }

        emailUser.setEmail(user.getEmail());
        emailUser.setWdate(user.getWdate());
        emailUser.setPassword(user.getPassword());
        emailUser.setGender(user.getGender());

        User dbuser = userRepository.save(emailUser);
        return dbuser;
    }


    public User delete(Long id) {
        Optional<User> delUser = userRepository.findById(id);
        if (delUser.isEmpty()){
            throw new UserException(ErrorCode.NOTDELETE);
        }
        userRepository.delete(delUser.get());

        return delUser.get();

    }
}
