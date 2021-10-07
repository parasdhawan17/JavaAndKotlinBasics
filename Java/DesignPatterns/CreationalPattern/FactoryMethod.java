package Java.DesignPatterns.CreationalPattern;

// Abstract class or an interface
interface Transport {
    public int milage();

    public int capacity();

    public void deliver();

}

class Truck implements Transport {

    int milage = 10;
    int capacity = 250;

    @Override
    public int milage() {
        return milage;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public void deliver() {
        System.out.println("Delivered through land");
    }

}

class Ship implements Transport {

    int milage = 20;
    int capacity = 550;

    @Override
    public int milage() {
        return milage;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public void deliver() {
        System.out.println("Delivered through sea");
    }
}

class TransPortFactory {
    public Transport getTransporter(String name) throws Exception {
        if (name.equals("Truck")) {
            return new Truck();
        } else if (name.equals("Ship")) {
            return new Ship();
        } else throw new Exception("Unkow Transport");
    }
}

public class FactoryMethod {
    public static void main() throws Exception {
        TransPortFactory transPortFactory = new TransPortFactory();
        Transport transport = transPortFactory.getTransporter("Ship");
        transport.deliver();
    }
}
