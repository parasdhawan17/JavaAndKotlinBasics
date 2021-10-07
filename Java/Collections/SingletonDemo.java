package Java.Collections;

// https://www.geeksforgeeks.org/singleton-class-java/

// Singleton class
class Dialog{

    // Single static instance
    private static Dialog dialog=null;

    // Private constructor
    private Dialog(){
        System.out.println("Dialog Constructor");
    }

    // static get instance method
    public static Dialog getInstance(){
        if(dialog==null) dialog = new Dialog();
        return dialog;
    }

    // Non static functions
    public void whichDialog(){
        System.out.println("Print dialog");
    }
}

public class SingletonDemo {
    public static void main(String[] args){
        // Not allowed
//        Dialog dialog = new Dialog();

        // get instance of singleton class
        Dialog dialog = Dialog.getInstance();
        dialog.whichDialog();
    }
}
