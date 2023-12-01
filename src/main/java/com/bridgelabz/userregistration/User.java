package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String firstName;
    public String getFirstName(){
        return this.firstName;
    }
    public boolean setFirstName(String firstName){
        if(validateFirstName(firstName)){
            this.firstName = firstName;
            return true;
        }
        System.out.println("Please provide at least 3 character , with first letter Capital " + firstName);
        return false;
    }
    private boolean validateFirstName(String firstName){
        String regex = "^[A-Z].{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
