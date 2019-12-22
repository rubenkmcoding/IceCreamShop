package eatable;

public class Magnum implements Eatable {

    MagnumType magnumType;


    //----------Constructor--------
    public Magnum() {
    }

    public Magnum(MagnumType magnumType) {
        this.magnumType = magnumType;
    }

    @Override
    public void eat() {
        System.out.println("Hmmmm, eating a nice Magnum with flavor " + magnumType);
    }

    public MagnumType getMagnumType() {
        return magnumType;
    }
}
