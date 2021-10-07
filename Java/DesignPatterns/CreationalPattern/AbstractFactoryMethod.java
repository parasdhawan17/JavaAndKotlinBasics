package Java.DesignPatterns.CreationalPattern;

// Leve -1
interface Chair {
}

class VictorianChair implements Chair {
}

class ModernChair implements Chair {
}

interface CoffeeTable {
}

class VictorianCoffeeTable implements CoffeeTable {
}

class ModernCoffeeTable implements CoffeeTable {
}

interface Sofa {
}

class VictorianSofa implements Sofa {
}

class ModernSofa implements Sofa {
}

// Factory - 1
interface FurnitureFactory {
    Chair createChair();

    CoffeeTable createCoffeeTable();

    Sofa createSofa();
}

// Factory - 2
class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

public class AbstractFactoryMethod {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = providerFurniture();
        furnitureFactory.createChair();
        furnitureFactory.createCoffeeTable();
        furnitureFactory.createSofa();
    }

    private static FurnitureFactory providerFurniture(){
        return new VictorianFurnitureFactory();
    }
}
