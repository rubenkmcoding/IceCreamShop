package application;

import Sellers.IceCreamCar;
import Sellers.IceCreamSeller;
import Sellers.PriceList;
import Sellers.Stock;
import eatable.Eatable;
import exceptions.NoMoreIceCreamException;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1.5, 3.5, 3);
        Stock stockIceCreamCar = new Stock(3,10,50,10);
        IceCreamSeller iceCreamCar = new IceCreamCar(priceList,stockIceCreamCar,456);

        Eatable[] orderedIceCreams = new Eatable[5];
        iceCreamCar.orderIceRocket();

        try {
            orderedIceCreams[0] = iceCreamCar.orderIceRocket();
            orderedIceCreams[1] = iceCreamCar.orderIceRocket();
            orderedIceCreams[2] = iceCreamCar.orderIceRocket();
            orderedIceCreams[3] = iceCreamCar.orderIceRocket();
            orderedIceCreams[4] = iceCreamCar.orderIceRocket();
        } catch (NoMoreIceCreamException e) {
            e.printStackTrace();
        }

        for (Eatable ice: orderedIceCreams
        ) {
            if(ice != null){
                ice.eat();
            }
        }
        System.out.println("The IceCreamSalon made " + iceCreamCar.getProfit() + " €");

    }

}
