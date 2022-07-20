package com.example.pp_3_1_4_rest.dao;


import com.example.pp_3_1_4_rest.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleDao extends JpaRepository<Role,Long> {
}