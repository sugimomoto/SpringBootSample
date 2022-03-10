package com.example.demo.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private Integer age;
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
}
