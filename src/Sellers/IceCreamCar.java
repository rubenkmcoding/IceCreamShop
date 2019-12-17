package Sellers;

import eatable.*;

public class IceCreamCar implements IceCreamSeller {

    PriceList priceList;
    Stock stock;
    double profit;

    // Constructor
    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavor[] flavor) {
        return prepareCone(flavor);
    }

    private Cone prepareCone(Flavor[] flavors) {
        Cone cone1 = new Cone(flavors);
        //stock.getBalls() less than 1
        //its finish

        for (Flavor f:flavors){
            profit = priceList.getBallPrice();
        }

        //stock.setBalls(stock.getBalls()-1);
        return  cone1;

        }


    public IceRocket orderIceRocket() {
        return  null;
    }



    public IceRocket prepareRocket() {

return null;
    }


    public void prepareMagnum(MagnumType magnumtype){

    }

    public double getProfit() {
        return profit;
    }


    @Override
    public Magnum orderMagnum(MagnumType magnum) {
        return null;
    }

}
