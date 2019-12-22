package person;

import eatable.Eatable;
import exceptions.NoPersonFoundException;

public class Person {

    private String name;
    private int amountOfOrders;
    private Eatable[] orders;

    public Person() {
    }

    public Person(String name, int orderAmount) {
        this.name = name;
        amountOfOrders = orderAmount;
        orders = new Eatable[orderAmount];
    }

    public void setName(String name) throws NoPersonFoundException {
        if(name.isEmpty()){
            throw new NoPersonFoundException("Invalid name given");
        } else {
            this.name = name;
        }
    }

    public int getAmountOfOrders() {
        return amountOfOrders;
    }

    public Eatable[] getOrders() {
        return orders;
    }

    public void setOrders(int orders) throws NoPersonFoundException {
        if(orders <= 10 && orders >0){
            this.orders = new Eatable[orders];
            this.amountOfOrders = orders;
        } else {
            throw new NoPersonFoundException("invalid order amound found, min 1 and max 10 orders allowed");
        }

    }

    public void addReceivedIceCream(Eatable iceCream){
        for(int i = 0; i < orders.length; i++){
            if(orders[i] == null){
                orders[i] = iceCream;
                break;
            }
            if(i == orders.length-1){
                System.out.println("order complete - you cant add more");
            }
        }
    }

    public void printOrders(){
        for (Eatable ice: orders
        ) {
            ice.eat();
        }
    }
}

