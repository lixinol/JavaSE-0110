package day04;

import java.security.PrivateKey;

public class Devision {
    private int x;
    private int y;
    public Devision(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y){
        if(y==0)
            System.out.println("Error");
        else
            this.y=y;

    }
}
