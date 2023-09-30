package com.search.test.profile.data.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class profile {
    @Id
    private String email;
    private String password;
    private String name;



}
