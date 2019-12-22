package application;

import Sellers.*;
import eatable.*;
import exceptions.NoMoreIceCreamException;
import exceptions.NoPersonFoundException;
import person.Person;

import java.util.Scanner;

public class BuyerMenu {

    PriceList carPriceList = new PriceList(1.5, 3, 4);
    PriceList salonPriceList = new PriceList(1.2, 3, 4.5);
    Stock carStock = new Stock(10, 10, 10, 10);

    IceCreamSeller salon = new IceCreamSalon(salonPriceList);
    IceCreamSeller iceCar = new IceCreamCar(carPriceList,carStock,456);

    Scanner kbd = new Scanner(System.in);

    public BuyerMenu() {

    }

    public void startBuyerMenu(Person buyer){
        startLoop(buyer);
    }

    private void startLoop(Person buyer) {

        int companyChoice = getPersonDetailsAndSalonOrCarChoice(buyer);
        switch (companyChoice) {
            case 1:
                getPersonOrders(salon, buyer);
                break;
            case 2:
                getPersonOrders(iceCar, buyer);
                break;
            default:
                break;
        }
    }

    private int getPersonDetailsAndSalonOrCarChoice(Person buyer) {
        int choice = 0;
        String inputName;
        while (true) {
            System.out.println("Welcome to IceCream land !");
            System.out.println("please complete your person details");
            System.out.println("What is your name ?");
            try {
                inputName = kbd.nextLine();
                if(inputName.equals("")){
                    buyer.setName(kbd.nextLine());
                } else {
                    buyer.setName(inputName);
                }

            } catch (NoPersonFoundException e) {
                e.printStackTrace();
            }
            System.out.println("How many orders do you want to place ?");
            try {
                buyer.setOrders(kbd.nextInt());
            } catch (NoPersonFoundException e) {
                e.printStackTrace();
            }
            System.out.println("You want to go to the salon or the car? ");
            System.out.println("1. Salon\n2. Car\n3. Exit - or any other key");
            if (kbd.hasNextInt()) {
                choice = kbd.nextInt();
            }
            if (choice > 0 && choice < 4) {
                return choice;
            } else {
                System.out.println("Wrong input - Try again");
            }
        }
    }

    private void getPersonOrders(IceCreamSeller iceCreamSeller, Person buyer) {
        boolean completedOrderCorrectly = false;
        int menuChoiceOne = 0;
        boolean menuChoiceOneCorrect = false;
        int amountOfOrders = buyer.getAmountOfOrders();

        while (!completedOrderCorrectly) {
            do {
                printIceCreamMenu();
                menuChoiceOne = kbd.nextInt();
                menuChoiceOneCorrect = checkMenuChoice(menuChoiceOne);
            } while (!menuChoiceOneCorrect);

            switch (menuChoiceOne) {
                case 1:
                    try {
                        buyer.addReceivedIceCream(iceCreamSeller.orderMagnum(askBuyerMagnumType(iceCreamSeller)));
                        amountOfOrders--;
                    } catch (NoMoreIceCreamException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        buyer.addReceivedIceCream(iceCreamSeller.orderIceRocket());
                        amountOfOrders--;
                    } catch (NoMoreIceCreamException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        buyer.addReceivedIceCream(iceCreamSeller.orderCone(askBuyerFlavours(iceCreamSeller)));
                        amountOfOrders--;
                    } catch (NoMoreIceCreamException e) {
                        e.printStackTrace();
                    }
                    break;
            }

            if (amountOfOrders == 0) {
                completedOrderCorrectly = true;
                int totalPrice = 0;
                for (Eatable iceOrdered: buyer.getOrders()
                ) {
                    if(iceOrdered instanceof Magnum){
                        totalPrice += iceCreamSeller.getPriceList().getMagnumPrice(((Magnum) iceOrdered).getMagnumType());
                    }
                    if(iceOrdered instanceof IceRocket){
                        totalPrice += iceCreamSeller.getPriceList().getRocketPrice();
                    }
                    if(iceOrdered instanceof Cone){
                        totalPrice += iceCreamSeller.getPriceList().getBallPrice()*((((Cone) iceOrdered).getBalls().length));
                    }
                }
                System.out.println("total Price of order = " + totalPrice + " €");
            }
        }

    }

    private Flavor[] askBuyerFlavours(IceCreamSeller iceCreamSeller) {
        int amountOfBalls = 0;
        boolean correctAmountOfBalls = false;
        int counter = 0;

        while (!correctAmountOfBalls) {
            System.out.println("How many balls do you want on this cone? ");
            amountOfBalls = kbd.nextInt();
            if (amountOfBalls > 0 && amountOfBalls <= 4) {
                correctAmountOfBalls = true;
            }
        }
        Flavor[] orderedBalls = new Flavor[amountOfBalls];
        while (amountOfBalls > 0) {

            System.out.println("What flavour would you like? ");
            for (int i = 0; i < Flavor.values().length; i++) {
                System.out.println((i + 1) + ". " + Flavor.values()[i] + " - " + iceCreamSeller.getPriceList().getBallPrice() + " €");
            }
            int choice = kbd.nextInt();
            if (choice > 0 && choice <= Flavor.values().length) {
                orderedBalls[counter] = Flavor.values()[choice - 1];
                amountOfBalls--;
                counter++;
            } else {
                System.out.println("Wrong choice of Flavour");
            }
        }
        return orderedBalls;
    }

    private MagnumType askBuyerMagnumType(IceCreamSeller iceCreamSeller) {
        while (true) {
            System.out.println("What flavour would you like? ");
            for (int i = 0; i < MagnumType.values().length; i++) {
                System.out.println((i + 1) + ". " + MagnumType.values()[i] + " - " + iceCreamSeller.getPriceList().getMagnumPrice(MagnumType.values()[i]) + " €");
            }
            int choice = kbd.nextInt();
            if (choice > 0 && choice <= MagnumType.values().length) {
                return MagnumType.values()[choice - 1];
            }
        }
    }

    private void printIceCreamMenu() {
        System.out.println("What would you like to order");
        System.out.println("1. A Magnum");
        System.out.println("2. An IceRocket");
        System.out.println("3. A cone of IceCream");
    }

    private boolean checkMenuChoice(int menuChoiceOne) {
        if (menuChoiceOne > 0 && menuChoiceOne < 4) {
            return true;
        } else {
            System.out.println("Wrong input - go again");
            return false;
        }
    }

}


