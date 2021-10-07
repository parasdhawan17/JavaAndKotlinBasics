package Java.DesignPatterns.StructuralPattern;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

interface Graphics{
    void move(int x,int y);
    void draw();
}

class Dot implements Graphics{

    int x,y;
    Dot(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x +=x;
        this.y +=y;
    }

    @Override
    public void draw() {
        // Draw a dot at x,y
    }
}

class Circle extends Dot{

    int radius;

    Circle(int x, int y,int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Draw a circle
    }
}

class CompoundGraphics implements Graphics{

    List<Graphics> graphicsArray = new ArrayList<Graphics>();

    void addChild(Graphics graphics){
        graphicsArray.add(graphics);
    }

    void remove(Graphics graphics){
        graphicsArray.remove(graphics);
    }

    @Override
    public void move(int x, int y) {
        for(Graphics graphics: graphicsArray){
            graphics.move(x,y);
        }
    }

    @Override
    public void draw() {
        for(Graphics graphics: graphicsArray){
            graphics.draw();
        }
    }
}

public class CompositeMethod {
    public static void main(String[] args){
        CompoundGraphics compoundGraphics = new CompoundGraphics();
        compoundGraphics.addChild(new Dot(1,2));
        compoundGraphics.addChild(new Circle(2,3,10));

        compoundGraphics.draw();
        compoundGraphics.move(10,20);
    }
}
