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


    public Cone prepareCone(Flavor[] cone) {


        return null;
    }

    public IceRocket orderIceRocket() {
        return null;
    }



    public IceRocket prepare() {
        return null;
    }

    public void prepareMagnum(MagnumType magnum){

    }

    public double getProfit() {
        return profit;
    }

    @Override
    public void orderCone(Flavor[] cone) {

    }

    @Override
    public Magnum orderMagnum(MagnumType magnum) {
        return null;
    }

}
