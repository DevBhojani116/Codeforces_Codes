import java.util.*;
public class Olympiad
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Olympiad oly = new Olympiad();
        oly.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int st[] = new int[n];
        int one = 0, two = 0, three = 0;
        for(int i = 0; i<n; i++)
        {
            st[i] = sc.nextInt();
            if(st[i] == 1)
                one++;
            if(st[i] == 2)
                two++;
            if(st[i] == 3)
                three++;
        }
        if(one == 0 || two == 0 || three == 0)
        {
            System.out.println(0);
            System.exit(0);
        }
        int o[] = new int[one];
        int tw[] = new int[two];
        int th[] = new int[three];
        int c = 0;
        for(int i = 0; i<n; i++)
        {
            if(st[i] == 1)
            {
                o[c] = i;
                c++;
            }
        }
        c = 0;
        for(int i = 0; i<n; i++)
        {
            if(st[i] == 2)
            {
                tw[c] = i;
                c++;
            }
        }
        c = 0;
        for(int i = 0; i<n; i++)
        {
            if(st[i] == 3)
            {
                th[c] = i;
                c++;
            }
        }
        System.out.println(Math.min(Math.min(one,two),three));
        for(int i = 0; i<Math.min(Math.min(one,two),three); i++)
        {
            System.out.println((o[i]+1) + " " + (tw[i]+1) + " " + (th[i]+1));
        }
    }
}
