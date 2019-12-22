package Sellers;

import eatable.*;
import exceptions.NoMoreIceCreamException;


public class IceCreamCar implements IceCreamSeller {

   private PriceList priceList;
   private Stock stock;
   private double profit;

   //------- Constructors----------


    public IceCreamCar(PriceList priceList, Stock stock, double profit) {
        this.priceList = priceList;
        this.stock = stock;
        this.profit = 0;
    }


    @Override
    public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException {
        if(balls.length <= stock.getBalls() && stock.getCones()>=1){
            return prepareCone(balls);
        } else {
            throw new NoMoreIceCreamException("Not enough balls or cones in stock to make cone");
        }
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        if(stock.getIceRockets()>=1){
            stock.setIceRockets(stock.getIceRockets()-1);
            return prepareIceRocket();
        } else {
            throw new NoMoreIceCreamException("All Ice rockets are sold out !");
        }
    }

    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {

        if(stock.getMagnums()>0){
            return prepareMagnum(type);
        } else {
            throw new NoMoreIceCreamException("Out of Magnums - Cant order a Magnum anymore");
        }
    }

    @Override
    public double getProfit() {
        return profit;
    }

    private Cone prepareCone(Flavor[] balls){
        Cone cone = new Cone();
        for (Flavor flavor: balls
        ) {
            if(flavor != null){
                cone.addFlavor(flavor);
                profit += priceList.getBallPrice();
            }
        }
        return cone;
    }
    private Magnum prepareMagnum(MagnumType type){
        Magnum magnum = new Magnum(type);
        profit += priceList.getMagnumPrice(type);
        return magnum;
    }

    private IceRocket prepareIceRocket(){
        profit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public PriceList getPriceList() {
        return priceList;
    }

    public Stock getStock() {
        return stock;
    }
}


