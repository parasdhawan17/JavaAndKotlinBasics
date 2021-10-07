package Java.DesignPatterns.CreationalPattern;

class Reminder{
    private int number;
    private int divider;

    private static Reminder reminder;

    private Reminder(int number,int divider){
        this.number = number;
        this.divider = divider;
    }

    // Lazy Initialization
    public static Reminder getInstance(int number, int divider){
        synchronized (Reminder.class){
            if(reminder==null) {
                reminder = new Reminder(number, divider);
            }
            return reminder;
        }
    }
    public int getReminder(){
        return number%divider;
    }
}

public class SingletonMethod {
    public static void main(){
        Reminder reminder = Reminder.getInstance(10,2);
        reminder.getReminder();
    }
}
