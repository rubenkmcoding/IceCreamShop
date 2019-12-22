package Sellers;

import eatable.*;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
        this.totalProfit = 0;
    }

    @Override
    public Cone orderCone(Flavor[] balls) {
        Cone cone = new Cone();
        for (Flavor flavor: balls
        ) {
            cone.addFlavor(flavor);
            totalProfit += priceList.getBallPrice();
        }

        return cone;
    }


    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum magnum = new Magnum(type);
        totalProfit += priceList.getMagnumPrice(type);
        return magnum;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public PriceList getPriceList() {
        return priceList;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}

