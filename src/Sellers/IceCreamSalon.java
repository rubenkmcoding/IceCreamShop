package Sellers;

import eatable.*;

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

    // methodes implementeren
    public Cone orderCone(Flavor[] flavors) {
        Cone cone = new Cone(flavors); // nieuwe cone(ijshorens) aanmaken
        totalProfit += priceList.getBallPrice() * flavors.length; // berekenen van prijs  ijsbol + smaak
        return cone; // winst terug krijgen

    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType magnumType) {
        Magnum magnumtype = new Magnum(magnumType);
        totalProfit += priceList.getMagnumStandardPrice();
        return magnumtype;
    }

    @Override
    public String toString() {
        return "IcecreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
