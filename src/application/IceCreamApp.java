package application;


import Sellers.IceCreamSalon;
import Sellers.IceCreamSeller;
import Sellers.PriceList;
import eatable.Eatable;
import eatable.Flavor;
import eatable.MagnumType;
import exceptions.NoMoreIceCreamException;

public class IceCreamApp {

 public static void main(String[] args) throws NoMoreIceCreamException {

  PriceList priceList = new PriceList(1.5, 3.5, 3);
  IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);

  Eatable[] orderedIceCreams = new Eatable[5];
  Flavor[] order1 = {Flavor.LEMON, Flavor.BANANA};

  orderedIceCreams[0] = iceCreamSalon.orderMagnum(MagnumType.BLACKCHOCOLATE);
  orderedIceCreams[1] = iceCreamSalon.orderMagnum(MagnumType.ALPINENUTS);
  orderedIceCreams[2] = iceCreamSalon.orderCone(order1);
  orderedIceCreams[3] = iceCreamSalon.orderIceRocket();

  for (Eatable ice: orderedIceCreams
  ) {
   if(ice != null){
    ice.eat();
   }
  }
  System.out.println("The IceCreamSalon made " + iceCreamSalon.getProfit() + " €");
 }


}


// ====================== tweede optie ======================================

//    public static void main(String[] args) throws Exception {
//        // init the value for price via constructor
//       PriceList priceList = new PriceList();// prijs is al ingegeven in de (priceList Constructor)
//
//        // init the valeu for stock - means How many balls or magin in the stock that exist in the Icecreamcar
//        Stock stock = new Stock(); //<=====  prijslist instantie
//
//        //IceCreamSalon instantie met behulp van pricelist in de IceCreamSeller varaibele ingestoken.
//        IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);
//        //bestelling smaak
//        Flavor[] flavors = {Flavor.MOKKA,Flavor.BANANA,Flavor.STRAWBERRY};
//        Flavor[] flavors1 = {Flavor.LEMON,Flavor.BANANA,Flavor.VANILLA};
//        Flavor[] flavors2 = {Flavor.MOKKA,Flavor.PISTACHE,Flavor.STRAWBERRY};
//        Flavor[] flavors3 = {Flavor.STRACIATELLA,Flavor.BANANA,Flavor.STRAWBERRY};
//        Flavor[] flavors4 = {Flavor.MOKKA,Flavor.BANANA,Flavor.CHOCOLATE};
//
//
//        // Eatable instantie maken
//        Eatable [] iceCream = new Eatable [5];
//        // bestelling 5 iceCream plaatsen, en in de array van Eatable steken.
//        iceCream[0] = iceCreamSalon.orderCone(flavors1);
//        iceCream[1] = iceCreamSalon.orderCone(flavors3);
//        iceCream[2] = iceCreamSalon.orderCone(flavors);
//        iceCream[3] = iceCreamSalon.orderCone(flavors4);
//        iceCream[4] = iceCreamSalon.orderCone(flavors2);
//
//
//
//        System.out.println("total profit:" + iceCreamSalon.orderCone(flavors));
//
//    }
//
//}





