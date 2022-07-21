package com.example.pp_3_1_4_rest.services;

import com.example.pp_3_1_4_rest.entity.Role;

import java.util.Set;

public interface RoleService {
    Role add (Role role);
    Role getById (long id);
    Set<Role> getRoles(long [] ides);
}
