package Java.DesignPatterns.StructuralPattern;

import java.math.*;

interface Round{
    int getRadius();
}

class RoundHole {
    int radius;

    RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    boolean fits(Round round){
        if(round.getRadius()<radius) return true;
        else return false;
    }
}

class RoundPeg implements Round{
    int radius;

    RoundPeg(int radius) {
        this.radius = radius;
    }

    @Override
    public int getRadius() {
        return 0;
    }
}

class SquarePeg{
    int width;
    SquarePeg(int width){
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}

class SquarePegAdapter implements Round{
    SquarePeg peg;
    SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth()*Math.sqrt(2)/2);
    }
}

public class AdapterMethod {
    public static void main(String[] args){
        RoundHole roundHole = new RoundHole(20);
        RoundPeg roundPeg = new RoundPeg(10);
        SquarePeg squarePeg = new SquarePeg(10);
        roundHole.fits(roundPeg);
        // roundHole.fits(squarePeg) compilation error
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        roundHole.fits(squarePegAdapter);
    }
}
