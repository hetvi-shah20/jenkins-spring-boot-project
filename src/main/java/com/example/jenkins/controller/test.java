package com.example.jenkins.controller;

public class test {
    public static void main(String[] args) {
        String password = "Pass#1%!";
        Boolean validPassword = isValidPassword(password);
        if(validPassword){
            System.out.println(password + " : This password is valid");
        }else{
            System.out.println(password + " : This password is not valid");
        }
    }

    public static Boolean isValidPassword( String password ) {

        if(password.length() < 8)
            return false;
        for(char ch: password.toCharArray()) {
            if((ch == ','))
                return false;
        }
        boolean hasUppercases = false;
        boolean hasLowercases = false;
        boolean hasDigits = false;
        int specialChars = 0;
        for(int i = 0, n = password.length() ; i < n ; i++) {
            char c = password.charAt(i);
            if(Character.isDigit(c)) {
                hasDigits = true;
            } else if(Character.isUpperCase(c)) {
                hasUppercases = true;
            } else if(Character.isLowerCase(c)) {
                hasLowercases = true;
            } else {
                specialChars++;
            }
        }
        if(specialChars > password.length()*20/100) {
            return false;
        }
        if(hasUppercases&&hasLowercases&&hasDigits&&(specialChars > 0)) {
            return true;
        }


        for(int i = 0; i < password.length() - 3; i++) {
            if(((int)password.charAt(i)+1 == (int)password.charAt(i+1))&&
                    ((int)password.charAt(i+2)+1 == (int)password.charAt(i+3))) {
                return false;
            }
        }

        return false;
    }

}