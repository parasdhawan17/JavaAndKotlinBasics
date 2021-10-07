package Java.DesignPatterns.CreationalPattern;

class House {
    private int walls = 0;
    private int doors = 0;
    private int windows = 0;
    private int roof = 0;
    private int garage = 0;
    void buildWalls() {
        walls++;
    }

    void buildDoors() {
        doors++;
    }

    void buildWindows() {
        windows++;
    }

    void buildRoof() {
        roof++;
    }

    void buildGarage() {
        garage++;
    }
}

class HouseBuilder implements Builder {

    private House house;

    HouseBuilder() {
        house = new House();
    }

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildStepA() {
        house.buildWalls();
        house.buildRoof();
        return;
    }

    @Override
    public void buildStepB() {
        house.buildWalls();
        house.buildRoof();
        house.buildDoors();
        return;
    }

    @Override
    public void buildStepC() {
        house.buildWalls();
        house.buildRoof();
        house.buildDoors();
        house.buildGarage();
        return;
    }

    @Override
    public House build() {
        return house;
    }
}

interface Builder {
    void reset();

    void buildStepA();

    void buildStepB();

    void buildStepC();

    House build();
}

class Director {
    Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    void reset() {
        builder.reset();
    }

    House makeSimpleHouse() {
        builder.buildStepA();
        return builder.build();
    }
    House makeComplexHouse() {
        builder.buildStepB();
        builder.buildStepC();
        return builder.build();
    }
}

public class BuilderMethod {
    public static void main(String[] args) {
        // Option -1 With Director
        HouseBuilder houseBuilder = new HouseBuilder();
        Director director = new Director(houseBuilder);
        House house = director.makeComplexHouse();

        // Option -2 Without Director
        HouseBuilder houseBuilder1 = new HouseBuilder();
        // Make simple house
        houseBuilder1.buildStepA();
        House house1 = houseBuilder1.build();
    }
}
