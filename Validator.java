package com.skaaria;

public class Validator {
    public static final int MAX_LOGIN_LENGTH = 20;
    public static final int MIN_AGE = 18;
    private Validator(){
    }
    public static boolean method(User o)throws LoginLengthInvalidException,NotTheSamePasswordsException,InvalidAgeException{
        int isLoginLengthInvalid=0;
        int isTheSamePasswords=0;
        int isInvalidAge=0;

        try {
            if (o.getLogin().length() > MAX_LOGIN_LENGTH ) {
                throw new LoginLengthInvalidException("login length invalid");
            }
        } catch (LoginLengthInvalidException e){
            isLoginLengthInvalid=1;
        }

        try {
            if (!(o.getPassword().equals(o.getRepeatPassword()))) {
                throw new NotTheSamePasswordsException("Not The Same Passwords");
            }
        }catch (NotTheSamePasswordsException e) {
            isTheSamePasswords = 1;
        }

        try {
            if (o.getAge() < MIN_AGE ) {
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
