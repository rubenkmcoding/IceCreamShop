package application;

import Sellers.IceCreamCar;
import Sellers.IceCreamSalon;
import Sellers.PriceList;
import Sellers.Stock;
import eatable.Cone;
import eatable.Eatable;
import eatable.Flavor;

public class IceCreamApp {

    public static void main(String[] args) {
        // init the value for price via constructor
        PriceList priceList = new PriceList(2,2,1.5);

        // init the valeu for stock - means How many balls or magin in the stock that exist in the Icecreamcar
        Stock stock = new Stock(5,5,5,5);

        // make new constructor for init the price and stock that reference to icecream object
        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);

        // create an order by flavor as array refer to flavor1
        Flavor [] flavors1 = {Flavor.BANANA,Flavor.LEMON};
        Flavor [] flavors2 = {Flavor.LEMON};
        Flavor [] flavors3 = {Flavor.MOKKA,Flavor.LEMON};
        Flavor [] flavors4 = {Flavor.BANANA,Flavor.LEMON,Flavor.PISTACHE};
        Flavor [] flavors5 = {Flavor.MOKKA};
        Flavor [] flavors6 = {Flavor.MOKKA};


        // create an array for the eatable that save the orders inside it
        Eatable[] eatables = new Eatable[10];

        eatables[0] = iceCreamCar.orderCone(flavors1);
//        eatables[0].eat();
        eatables[1] = iceCreamCar.orderCone(flavors2);
//        eatables[1].eat();
        eatables[2] = iceCreamCar.orderCone(flavors3);

        eatables[3] = iceCreamCar.orderCone(flavors4);
//        eatables[3].eat();
        eatables[4] = iceCreamCar.orderCone(flavors5);
//        eatables[4].eat();

        eatables[5] = iceCreamCar.orderCone(flavors6);

        eatables[2].eat();






        //        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);


    }
}
