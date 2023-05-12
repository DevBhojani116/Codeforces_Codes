import java.util.*;
public class Exponent 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Exponent e = new Exponent();
        e.process();
    }   
    public void process()
    {
        int t = sc.nextInt();
        int n = 0;
        int c = 0;
        for(int i = 0; i<t; i++)
        {
            n = sc.nextInt();
            c = 0;
            for(int x = 2; x<=(int)Math.sqrt(n); x++)
            {
                for(int y = x; y<=(int)Math.sqrt(n); y++)
                {
                    if(Math.pow(x,y)*y + Math.pow(y,x)*x == n && c == 0)
                    {
                        c = 1;
                        System.out.println(x + "\t" + y);
                    }
                }
            }
            if(c == 0)
            {
                System.out.println("-1");
            }
        }
    }
}