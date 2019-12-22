package application;

import person.Person;

public class UserInterface {

    public static void main(String[] args) {


        Person[] buyersInLine = new Person[5];
        BuyerMenu menu = new BuyerMenu();

        for (int i = 0; i < buyersInLine.length; i++) {
            buyersInLine[i] = new Person();
            menu.startBuyerMenu(buyersInLine[i]);
            buyersInLine[i].printOrders();
        }


    }
}

