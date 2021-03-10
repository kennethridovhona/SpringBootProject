package com.springbootexercise.developersapi.domain;

public class User {
    private Long id;
    private String name;
    private String skills;

    public User() {
    }

    public User(Long id, String name, String skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}
