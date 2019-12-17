package eatable;

public class Cone implements Eatable {

    Flavor [] balls ;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }


    // hier ga ik  afprinten wat voor bollen of raketijse
    @Override
    public void eat() {
        System.out.print("The cone taste is : ");
        for (int i = 0; i <balls.length ; i++) {
            System.out.print(" "+ balls[i]);
        }
        System.out.println("");
    }
}
