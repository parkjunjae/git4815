package com.mh.restapi03.users;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {

        private final UserService userService;
        private final UserRepository userRepository;

        @GetMapping("usernameemail")
        public ResponseEntity<List<User>> getAllUserName(@RequestBody UserDto userDto){
            List<User> list = userRepository.findByUsernameContainingOrEmailContaining(userDto.getUsername(),userDto.getEmail());
            return ResponseEntity.status(HttpStatus.OK).body(list);
    }
        @GetMapping()
        public ResponseEntity<List<User>> seluser(User user){
            List<User> list = userService.select(user);
            return ResponseEntity.ok(list);
//        return ResponseEntity.status(HttpStatus.CREATED).body(list);
        }

        @GetMapping("/{id}")
        public ResponseEntity<User> getuserById(@PathVariable Long id){
            System.out.println(id);

            User user = userService.getuserById(id);
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }

        @PostMapping()
        public ResponseEntity<User> addUser (@RequestBody @Valid UserDto userDto){

            userDto.setWdate(LocalDateTime.now());
            ModelMapper modelMapper = new ModelMapper();
            User user = modelMapper.map(userDto,User.class);

            User dbuser = userService.regist(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(dbuser);
        }

        @PutMapping()
        public ResponseEntity<User> UpdateUser(@RequestBody @Valid UserDto userDto){
            ModelMapper modelMapper = new ModelMapper();
            User user = modelMapper.map(userDto,User.class);
            user.setWdate(LocalDateTime.now());

            User dbuser = userService.UpdateUser(user);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbuser);

        }

        @DeleteMapping("{id}")
        public ResponseEntity<User> DelUser(@PathVariable Long id){
            User dbuser = userService.delete(id);

            return ResponseEntity.status(HttpStatus.ACCEPTED).body(dbuser);
        }

        @Transactional()
        @GetMapping("tran")
        public String usertran(){
            User dbuser = userRepository.findById(1L).orElseThrow();

            dbuser.setUsername("박준재");
            dbuser.setEmail("wnswo1109@naver.com");

            return "tran";
        }



    }


