package Java.DesignPatterns.CreationalPattern;

class Rectengle{

    private int length ;
    private int breath;

    Rectengle(){

    }

    Rectengle(Rectengle rectengle){
        this.length = rectengle.length;
        this.breath = rectengle.breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected Rectengle clone() {
        return new Rectengle(this);
    }

    @Override
    public String toString() {
        return "Rectengle{" +
                "length=" + length +
                ", breath=" + breath +
                '}';
    }
}

public class PrototypeMethod {
    public static void main(String[] args) {
        Rectengle rectengle = new Rectengle();
        rectengle.setLength(20);
        rectengle.setBreath(10);
        System.out.println(rectengle.toString());
        Rectengle rectengle1 = rectengle.clone();
        rectengle1.setBreath(200);
        System.out.println(rectengle1.toString());
    }
}
