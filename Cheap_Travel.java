import java.util.*;
public class Cheap_Travel
{
    Scanner sc =  new Scanner(System.in);
    public static void main(String args[])
    {
        Cheap_Travel ct = new Cheap_Travel();
        ct.process();
    }  
    public void process()
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
            if(n%m == 0 && (n/m)*b<Math.min(Math.min(n*a,((n/m+1)*b)),((n/m)*b + (n%m)*a)))
                System.out.println((n/m)*b);
            else
                System.out.println(Math.min(Math.min(n*a,((n/m+1)*b)),((n/m)*b + (n%m)*a)));
    }
}
