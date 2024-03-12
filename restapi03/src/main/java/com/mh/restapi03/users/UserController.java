package com.mh.restapi03.users;


import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.UserException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
@Tag(name = "User-controller",description = "유저 조회 등록 수정 삭제") // 상단 제목을 설정 할 수 있다 .
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Operation(summary = "사용자 전체 목록 보기",description = "사용자 전체 정보를 조회 할 수 있다.") // get에 대한 제목을 설정
    @ApiResponses(
            {
                    @ApiResponse(responseCode = "200",description = "ok"),
                    @ApiResponse(responseCode = "404",description = "사용자들이 없을 때 나옵니다.")
            }
    )
    @GetMapping("users")
    public ResponseEntity<List<User>> getAllUsers(User user){
        List<User> list = userService.getAllUsers(user);
        if (list.size() ==0 ){
         throw new UserException(ErrorCode.NOTFOUND);

        }

        return ResponseEntity.ok(list);
        //return ResponseEntity.status(HttpStatus.OK).body(list); 상태값을 넘겨줄려고 할 때 이렇게 쓴다.
    }
    @GetMapping("users/{id}")
    public ResponseEntity<User> getUsers(
            @Parameter(description = "조회하고자 하는 사용자 ID",
            name = "사용자 ID",
                    required = true
            )
            @PathVariable Long id) {

        System.out.println(id);
        User user = userService.getUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);

    }

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody @Valid UserDto userDto){

        userDto.setWdate(LocalDateTime.now());
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDto,User.class);
       // User user = modelMapper.map(userDto,User.class);
//        BeanUtils.copyProperties(userDto,user);
        // 클래스를 복사 하는 법 BeanUtils.copyPropertoes 와 modelMapper 가 있다.
        User dbuser = userService.regist(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(dbuser);
    }
    @PutMapping("users")
    public ResponseEntity<User> UpdateUser(@RequestBody @Valid UserDto userDto){

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userDto, User.class);
        user.setWdate(LocalDateTime.now());

        User dbuser = userService.UpdateUser(user);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbuser);
    }

    @DeleteMapping("users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id){
        User dbuser = userService.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbuser);
    }

    @Transactional() // 영구속성에 의해서 setter 메서드 사용시 db에 update 실행됨...
    @GetMapping("users/tran")
    public String userstran(){
        User dbUser = userRepository.findById(1L).orElseThrow();
        dbUser.setUsername("김길동"); //업데이트 구문 실행
        dbUser.setEmail("aa@naver.com");
        return "tran";
    }

}
