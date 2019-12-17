package Sellers;

public class Stock {

    public int iceRocket;
    public int cone;
    public int balls;
    public int magni;


    public Stock() {
        this.iceRocket = 5;
        this.cone = 4;
        this.balls = 20;
        this.magni = 10;
}

    public Stock(int iceRocket, int cone, int balls, int magni) {
        this.iceRocket = iceRocket;
        this.cone = cone;
        this.balls = balls;
        this.magni = magni;
    }

    public int getIceRocket() {
        return iceRocket;
    }

    public void setIceRocket(int iceRocket) {
        this.iceRocket = iceRocket;
    }

    public int getCone() {
        return cone;
    }

    public void setCone(int cone) {
        this.cone = cone;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}
