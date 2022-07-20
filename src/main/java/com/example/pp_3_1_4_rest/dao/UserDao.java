package com.example.pp_3_1_4_rest.dao;

import com.example.pp_3_1_4_rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
    User getUserByEmail(String username);
}

