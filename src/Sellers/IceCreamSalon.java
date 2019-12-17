package Sellers;

import eatable.Flavor;
import eatable.IceRocket;
import eatable.Magnum;
import eatable.MagnumType;

public class IceCreamSalon implements IceCreamSeller {

    // declaration
    PriceList priceList;
    double totalProfit;

    // constructors
    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    public IceCreamSalon(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    //getter

    public void getTotalProfit(){

    }

    // implement methodes
    public void orderCone(Flavor[] cone) {

    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        return null;
    }

    @Override
    public String toString() {
        return "IcecreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
