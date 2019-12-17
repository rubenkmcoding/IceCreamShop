package Sellers;

import eatable.*;

public interface IceCreamSeller {

    //methode
    void orderCone(Flavor[] cone);

    IceRocket orderIceRocket();

    Magnum orderMagnum(MagnumType magnum);

}
