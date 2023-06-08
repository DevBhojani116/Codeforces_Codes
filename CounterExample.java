//483A CounterExample
import java.util.*;
public class  CounterExample
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        CounterExample ce = new CounterExample();
        ce.process(); 
    }
    public void process()
    {
        long l = sc.nextLong();
        long r = sc.nextLong();
        for(long i = l; i<=r; i++)
        {
            for(long j = i+1; j<=r;j++)
            {
                if(coprime(i,j))
                {
                    for(long k = j+1; k<=r; k++)
                    {
                        if(coprime(j,k) == true && coprime(i,k) == false)
                        {
                            System.out.println(i + " " + j + " " + k);
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }
    public boolean coprime(long a, long b)
    {
        for(long i = 2; i<=b-a; i++)
        {
            if(a%i == 0 && b%i == 0)
                return false;
        }
        return true;
    }
}
