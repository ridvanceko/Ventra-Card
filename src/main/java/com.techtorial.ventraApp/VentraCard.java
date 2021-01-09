package com.techtorial.ventraApp;

import java.util.Random;

public class VentraCard {

    /*
    1- Create PRIVATE instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */

    private String fullName;
    private String phoneNumber;
    private String email;
    private long cardNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public VentraCard createCard(String fullName, String phoneNumber, String email){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;

        createCardNumber(); //new card will create new card number

    /*
    this method needs to return VentraCard according to the parameter
     */
        return null;
    }

    public long createCardNumber(){

        long cardNumber = (long)(Math.random()*1000000000000000l);
        this.cardNumber = cardNumber;
        /*
        this method needs to return the 16 digit card number
         */

        return cardNumber;
    }

}
