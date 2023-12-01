package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @desc : User Class contains methods related to registration and validity
 */
public class User {
    private String firstName;
    private String lastName;

    /**
     * @desc : method to return the first name of the user
     * @params:
     * @return : first name of user
     */
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * @desc : method to return the last name of the user
     * @params:
     * @return : last name of user
     */
    public String getLastName(){
        return this.lastName;
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
     * @desc : method to set the last name of the user
     * @params: string last name of the user
     * @return : true whether the last name is set or not if it is valid or not
     */
    public boolean setLastName(String lastName){
        if(validateLastName(lastName)){
            this.lastName = lastName;
            return true;
        }
        System.out.println("Please provide at least 3 character , with first letter Capital " + lastName);
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

    /**
     * @desc : method to validate the last name of the user
     * @params: lastname string
     * @return : valid or not
     */
    private boolean validateLastName(String lastName){
        String regex = "^[A-Z].{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}
