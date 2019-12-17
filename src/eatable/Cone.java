package eatable;

public class Cone implements Eatable {

    Flavor [] balls = new Flavor []{};

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }


    // hier ga ik  afprinten wat voor bollen of raketijse
    @Override
    public void eat() {

    }
}
