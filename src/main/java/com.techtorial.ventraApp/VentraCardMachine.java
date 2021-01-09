package com.techtorial.ventraApp;

import java.util.ArrayList;

public class VentraCardMachine {

    private String location;
    private ArrayList<VentraCard> allCards;

    public VentraCardMachine(String location){
        this.location=location;
        this.allCards=new ArrayList<VentraCard>();
    }

    public boolean addCard(VentraCard card){
        if(!allCards.contains(card)){
            allCards.add(card);
            return true;
        }

        /*
         This method is taking the parameter as a VentraCard.
         if this VentraCard is not registered before this method will add the VentraCard to the allCards(ArrayList).
         Using VentraCard cardNumber you can verify that the card is in allCards or not
         */
        return false;
    }

    public void printCardNumbers(ArrayList <VentraCard> cards){

        for (int i = 0; i <allCards.size() ; i++) {

            for (int j = 0; j <cards.size() ; j++) {

                if (allCards.get(i) == cards.get(j)) {
                    System.out.println(cards.get(j).getCardNumber());
                }

            }

        }
        /*
         This method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */
    }

    public boolean updateCard(long oldCardNumber, VentraCard newCard){

        /*
        This method is taking two parameter oldCardNumber and it will replace this card with newCard.

        */

        int oldCardIndex = 0;

        for (int i = 0; i <allCards.size() ; i++) {

            if(allCards.get(i).getCardNumber() == oldCardNumber ) {
                oldCardIndex = i;
            }

        } allCards.set(oldCardIndex, newCard);

        return false;
    }

    public void printCardHoldersName(ArrayList <VentraCard> cards){

        for (int i = 0; i <allCards.size() ; i++) {

            for (int j = 0; j <cards.size() ; j++) {

                if (allCards.get(i) == cards.get(j)) {
                    System.out.println(cards.get(j).getCardNumber());
                }

            }

        }







    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take three parameter as a cardNumber, oldEmail and newEmail. This method will replace old email address with
        new email address matching with cardNumber
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the car removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
        5- Create the method will take two parameter as an oldCardNumber and newCardNumber.
        This method will update the old card number with new card number
     */
}}
