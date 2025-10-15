package com.korit.study.ch16.entity;

public class User {
    private int id;
    public String username;
    private String password;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public User(int id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }
}
