import java.util.*;
public class Capital 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Capital c = new Capital();
        c.process();
    }   
    public void process()
    {
        String s = sc.next();
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
    }
}
