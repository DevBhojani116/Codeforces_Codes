import java.util.*;
public class Even_Odds
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Even_Odds e = new Even_Odds();
        e.process();
    }
    public void process()
    {
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(k>n/2)
            if(n%2 == 1)
                if(k == n/2+1)
                    System.out.println(n);
                else
                    System.out.println((k-n/2-1)*2);
            else
                System.out.println((k-n/2)*2);
        else
            System.out.println(k*2-1);
    }
}