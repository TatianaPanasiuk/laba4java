package com.example.laba3_oop;

import java.io.Serializable;

public class Character implements Serializable {

    private String name;
    private String company;
    private int age;
    private String weapon;
    private String email;
    private String number;

    private int what;

    private String lanProg;

    public Character(String name, String company, int age){
        this.name = name;
        this.company = company;
        this.age = age;
    }

//    public Character(String name, String company, int age, String lanProg, int what){
//        this.name = name;
//        this.company = company;
//        this.age = age;
//        this.lanProg =lanProg;
//        this.what = what;
//    }

    public Character(String name, String company, int age, String weapon){
        this.name = name;
        this.company = company;
        this.age = age;
//        this.lanProg =lanProg;
//        this.what = what;
        this.weapon = weapon;
        number = "not found";
        email = "not found";
    }

    public Character(String name, String company, int age, String weapon, String email, String number){
        this.name = name;
        this.company = company;
        this.age = age;
//        this.lanProg =lanProg;
//        this.what = what;
        this.weapon = weapon;
        this.email = email;
        this.number = number;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getNumber(){return number;}
    public void setNumber(String number){this.number = number;}




    public int getAge() {
        return age;
    }
    public String getWeapon(){return weapon;}
}