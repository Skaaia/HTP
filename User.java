package com.skaaria;

public class User {
    private String login;
    private String password;
    private String repeatPassword;
    private String name;
    private String surname;
    private int age;

    public User(String login, String password, String repeatPassword, String name, String surname, int age) {
        this.login = login;
        this.password = password;
        this.repeatPassword = repeatPassword;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean validator() throws LoginLengthInvalidException,NotTheSamePasswordsException,InvalidAgeException{
        int isLoginLengthInvalid=0;
        int isTheSamePasswords=0;
        int isInvalidAge=0;

        try {
            if (login.length() > 20 ) {
                throw new LoginLengthInvalidException("login length invalid");
            }
        } catch (LoginLengthInvalidException e){
            isLoginLengthInvalid=1;
        }

        try {
            if (!(password.equals(repeatPassword))) {
                throw new NotTheSamePasswordsException("Not The Same Passwords");
            }
        }catch (NotTheSamePasswordsException e) {
            isTheSamePasswords = 1;
        }

        try {
            if (age < 18 ) {
                throw new InvalidAgeException("Invalid Age ");
            }
        }catch (InvalidAgeException e) {
            isInvalidAge=1;
        }

        if (isLoginLengthInvalid==1){
            System.out.print("LoginLengthInvalid"+" ");
        }
        if(isTheSamePasswords==1){
            System.out.println("NotTheSamePasswords"+" ");
        }
        if(isInvalidAge==1){
            System.out.println("InvalidAge"+" ");
        }
        if (isLoginLengthInvalid==1 || isTheSamePasswords==1 || isInvalidAge==1) {
            return false;
        }else return true;
    }

}
