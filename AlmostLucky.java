import java.util.*;
public class AlmostLucky 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        AlmostLucky al = new AlmostLucky();
        al.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        for(int i = 4; i<=n; i++)
        {
            if(lucky(i))
            {
                if(n%i == 0)
                {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");   
    }
    public boolean lucky(int n)
    {
        while(n!=0)
            {
                if(n%10 != 4 && n%10 != 7)
                    return false;
                n /= 10;
            }
        return true;
    }
}
