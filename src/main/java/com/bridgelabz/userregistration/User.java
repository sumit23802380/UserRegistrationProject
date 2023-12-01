package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @desc : User Class contains methods related to registration and validity
 */
public class User {
    private String firstName;
    /**
     * @desc : method to return the first name of the user
     * @params:
     * @return : first name of user
     */
    public String getFirstName(){
        return this.firstName;
    }
    /**
     * @desc : method to set the first name of the user
     * @params: string first name of the user
     * @return : true whether the first name is set or not if it is valid or not
     */
    public boolean setFirstName(String firstName){
        if(validateFirstName(firstName)){
            this.firstName = firstName;
            return true;
        }
        System.out.println("Please provide at least 3 character , with first letter Capital " + firstName);
        return false;
    }
    /**
     * @desc : method to validate the first name of the user
     * @params: firstname string
     * @return : valid or not
     */
    private boolean validateFirstName(String firstName){
        String regex = "^[A-Z].{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
