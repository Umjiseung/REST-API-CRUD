package com.search.test.doamin.profile.data.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class profile {
    @Id
    private String email;
    private String password;
    private String name;



}
