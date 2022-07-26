package com.example.pp_3_1_4_rest.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;


@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", unique = true, length = 100)
    private String name;

    public Role() {}

    public Role(String name) {
        this.name = name;
    }

    public Role(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    @Override
    public String getAuthority() {
        return getName();
    }

    @Override
    public String toString() {
        return name;
    }
}
