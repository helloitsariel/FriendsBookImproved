package com.example.friendsbook;

import java.io.Serializable;

public class Friend {
    private String name;

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAge() {
        return age;
    }

    public String getContacts() {
        return contacts;
    }

    public String getHobbies() {
        return hobbies;
    }

    private String nickname;
    private String age;
    private String contacts;
    private String hobbies;

    Friend(){
        name = "";
        nickname = "";
        age = "";
        contacts = "";
        hobbies = "";
    }

    Friend(String name, String nickname, String age, String contacts, String hobbies){
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.contacts = contacts;
        this.hobbies = hobbies;
    }

    public  String toString(){
        return name;
    }
}
