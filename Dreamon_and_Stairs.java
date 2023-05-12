import java.util.*;
public class Dreamon_and_Stairs
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Dreamon_and_Stairs das = new Dreamon_and_Stairs();
        das.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = n/2 + n%2;
        if(min%m == 0)
        {
            System.out.println(min>n || min == 0?-1:min);
            System.exit(0);
        }
        int x = min + m - (min%m);
        System.out.println(x>n || x == 0?-1:x);
    }
}
