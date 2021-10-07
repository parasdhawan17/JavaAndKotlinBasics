package Java.DesignPatterns.BehavioralPattern;

abstract class Command{
    String text;
    abstract void execute();
}

class CopyCommand extends Command{


    @Override
    void execute() {

    }
}

class CutCommand extends Command{

    @Override
    void execute() {

    }
}

class ViewModel{
    void execute(Command command){
        command.execute();
    }
}

public class CommandMethod {
    public static void main(String[] args){
        ViewModel viewModel = new ViewModel();
        CopyCommand command = new CopyCommand();
        viewModel.execute(command);
    }
}
