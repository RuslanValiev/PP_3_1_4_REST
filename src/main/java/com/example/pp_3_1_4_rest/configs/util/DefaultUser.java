package com.example.pp_3_1_4_rest.configs.util;

import com.example.pp_3_1_4_rest.entity.Role;
import com.example.pp_3_1_4_rest.entity.User;
import com.example.pp_3_1_4_rest.services.RoleService;
import com.example.pp_3_1_4_rest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class DefaultUser {



    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;


    @PostConstruct
    private void initialize(){

        Set<Role> roles1 = new HashSet<>();
        roles1.add(roleService.add(new Role("ROLE_ADMIN")));
        roles1.add(roleService.add(new Role("ROLE_USER")));

        User user1 = new User("Vasya", "Vasya", 32, "vc@mail.ru", "123456");
        userService.add(user1);
        user1.setRoles(roles1);
    }
}
