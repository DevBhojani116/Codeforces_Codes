import java.util.*;
public class Prime 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Prime p = new Prime();
        p.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = n+1; i<=m; i++)  
        {
            if(isPrime(i))
            {
                if(i == m)
                {
                    System.out.println("YES");
                    System.exit(0);
                }
                else
                {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }  
        System.out.println("NO");
    }
    public boolean isPrime(int x)
    {
        for(int i = 2; i<=Math.sqrt(x); i++)
        {
            if(x%i == 0)
                return false;
            else
                continue;
        }
        return true;
    }
}

