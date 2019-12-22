package Sellers;

import eatable.*;
import exceptions.NoMoreIceCreamException;

public interface IceCreamSeller extends Profitable {

    //methode


    Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException;
    IceRocket orderIceRocket() throws NoMoreIceCreamException;
    Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException;

    PriceList getPriceList();



}
