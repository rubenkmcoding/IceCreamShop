package eatable;

public class Cone implements Eatable {

    Flavor [] balls ;

//--------COnstructors-----------
    public Cone() {
        this.balls = new Flavor[4];
    }
    public Cone(int amountOfBalls){  // maximum balls
        if(amountOfBalls<=4){ // als max balls kleiner of gelijk si aan 4
            this.balls = new Flavor[amountOfBalls]; //
        } else {
            throw new RuntimeException("to many balls selected");
        }

    }

    public Flavor[] getBalls() {
        return balls;
    }

    public Cone(Flavor[] balls) {
        if(balls.length <= 4){ // maximu balls
            this.balls = balls;
        } else {
            System.out.println("To many balls on a cone. Max 4");
        }

    }
// print
    private void printBallsOnCone(){
        for (Flavor ball: balls
        ) {
            if(ball != null){
                System.out.print(ball + " ");
            }
        }
        System.out.println("");
    }

    public void addFlavor(Flavor flavor){
        for(int i = 0; i < balls.length ; i++){
            if(balls[i] == null){
                balls[i] = flavor;
                break;
            }
            if(i == balls.length-1){
                System.out.println("Your cone is full, a max of 4 balls allowed");
            }

        }
    }

    @Override
    public void eat() {
        System.out.print("Eating a nice Cone of Ice with taste : ");
        printBallsOnCone();
    }
}