package Java.DesignPatterns.BehavioralPattern;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

interface ComponentWithContextualHelp{
    void showHelp();
}

abstract class Component implements ComponentWithContextualHelp{
    String tooltip;
    protected Container container;

    @Override
    public void showHelp() {
        if(tooltip!=null){
            // show toolhip
        }else container.showHelp();
    }
}

abstract class Container extends Component{
    private List<Component> childrens = new ArrayList<>();

    void add(Component component){
        childrens.add(component);
        component.container = this;
    }
}

class Button extends Component{

}

class Panel extends Container{
    String modalHelpText;

    @Override
    public void showHelp() {
        if(modalHelpText!=null){
            // show a modal window with help text
        }else super.showHelp();
    }
}

class Dialog extends Container{
    String wikiPageURl;

    @Override
    public void showHelp() {
        if(wikiPageURl!=null){
            // show a modal window with help text
        }else super.showHelp();
    }
}


public class BehaviourMethod {
    public static void main(String[] args){
        Dialog dialog= new Dialog();
        dialog.wikiPageURl = "http://";
        Panel panel = new Panel();
        panel.modalHelpText = "This pannel does";
        Button ok = new Button();
        ok.tooltip = "This is ok button";

        panel.add(ok);
        dialog.add(panel);

        dialog.showHelp();
        panel.showHelp();
        ok.showHelp();
    }
}
