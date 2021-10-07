package Java.DesignPatterns.StructuralPattern;

class RemoteControl {
    private Device device;
    RemoteControl(Device device){
        this.device = device;
    }

}

class AdvanceRemote extends RemoteControl {

    AdvanceRemote(Device device) {
        super(device);
    }
}

class SimpleRemote extends RemoteControl {

    SimpleRemote(Device device) {
        super(device);
    }
}

interface Device {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
}
class Tv implements Device {

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public int getVolume() {
        return 0;
    }
}
class Radio implements Device {

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public int getVolume() {
        return 0;
    }
}



public class BridgeMethod {
    public static void main(String[] args){
        // Creating tv advance remove
        AdvanceRemote advanceRemote = new AdvanceRemote(new Tv());

        // Creating radio advance remote
        AdvanceRemote advanceRemote1 = new AdvanceRemote(new Radio());

    }
}
