import java.util.*;
public class NearlyLucky 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        NearlyLucky nl = new NearlyLucky();
        nl.process();
    }
    public void process()
    {
        long n = sc.nextLong();
        long x = 0;
        while(n!=0)
        {
            if(n%10 == 4 || n%10 == 7)
                x++;
            n /= 10;
        }
        if(x == 4 || x == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
