import java.util.time;
public class Main{
    public static void main(String args[])
    {
        Calender c=Calender.getInstance();
        System.out.print("The current date is:"+c.getTime());
    }
}