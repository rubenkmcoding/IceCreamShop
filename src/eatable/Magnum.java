package eatable;

public class Magnum implements Eatable {

    MagnumType magnumType;

    public Magnum(){

    }

    public Magnum(MagnumType magnumType) {
        this.magnumType = magnumType;
    }

    public MagnumType getMagnumType() {
        return magnumType;
    }

    public void setMagnumType(MagnumType magnumType) {
        this.magnumType = magnumType;
    }

    @Override
    public void eat() {
        System.out.println();
    }
}
