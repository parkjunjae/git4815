package com.mh.restapi03.users;


import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.mh.restapi03.exception.ErrorCode;
import com.mh.restapi03.exception.UserException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("admin")
@RequiredArgsConstructor
public class AdminController {

    private final UserRepository userRepository;

    @GetMapping("users/{id}")
    public MappingJacksonValue getUserById(@PathVariable Long id){

        User user = userRepository.findById(id).orElseThrow(
                () -> new UserException(ErrorCode.NOTFOUND)
        );

        AdminUser adminUser = new AdminUser();
        BeanUtils.copyProperties(user,adminUser);

        MappingJacksonValue mappingJsonValue = new MappingJacksonValue(adminUser);
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("adminUser",
                SimpleBeanPropertyFilter.filterOutAllExcept("username","email","password"));
        mappingJsonValue.setFilters(filterProvider);

        return mappingJsonValue;
    }

    @DeleteMapping("users/{id}")
    public User deleteUserById(Long id){

        return new User();
    }



}
