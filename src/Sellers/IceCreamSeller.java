package Sellers;

import eatable.*;

public interface IceCreamSeller {

    //methode
    Cone orderCone(Flavor[] cone);

    IceRocket orderIceRocket();

    Magnum orderMagnum(MagnumType magnum);

}
