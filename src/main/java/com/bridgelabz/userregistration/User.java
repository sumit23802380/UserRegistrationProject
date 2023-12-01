package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @desc : User Class contains methods related to registration and validity
 */
public class User {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
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

    /**
     * @desc : method to return the last name of the user
     * @params:
     * @return : last name of user
     */
    public String getLastName(){
        return this.lastName;
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

    /**
     * @desc : method to get the phone number
     * @params:
     * @return : phonenumber string
     */
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    /**
     * @desc : method to set the phone number
     * @params: phonenumber string
     * @return : boolean phone number is valid and set or not
     */
    public boolean setPhoneNumber(String phoneNumber) {
        if(validatePhoneNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;
            return  true;
        }
        System.out.println("Please provide phone number according to rules country code followed with space and 10 digit number " + phoneNumber);
        return  false;
    }

    /**
     * @desc : method to validate the phone number using regex
     * @params: string phonenumber
     * @return : boolean valid phone number or not
     */
    private boolean validatePhoneNumber(String phoneNumber){
        String regex = "^\\d{2}\\s\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    /**
     * @desc : method to return the password
     * @params: string password
     * @return : boolean valid password or not
     */
    public String getPassword(){
        return this.password;
    }

    /**
     * @desc : method to set the password
     * @params: password string
     * @return : boolean password is valid and set or not
     */
    public boolean setPassword(String password){
        if(validatePassword(password)){
            this.password = password;
            return true;
        }
        System.out.println("Please provide valid password");
        return false;
    }

    /**
     * @desc : method to validate the password
     * @params: password string
     * @return : boolean password is valid or not
     */
    private boolean validatePassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
