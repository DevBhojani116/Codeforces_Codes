//189A
import java.util.*;
public class Cut_Ribbon 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Cut_Ribbon cr = new Cut_Ribbon();
        cr.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        int x = 0;
        int y = 0;
        while(a*x<=n)
        {
            y = 0;
            while(a*x+b*y<=n)
            {
                int z = (n-a*x-b*y)/c;
                if(a*x+b*y+c*z == n)
                {
                    max = (int)Math.max(x+y+z,max);
                }
                y++;
            }
            x++;
        }
        System.out.println(max);
    }   
}
