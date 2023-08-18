//499A
import java.util.*;
public class Movie 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Movie m = new Movie();
        m.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        int x = sc.nextInt();
        int time = 1;
        int count = 0;
        for(int i = 1; i<=n; i++)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            while((time+x)<=l)
            {
                time += x;
            }
            count += r-time+1;
            time = r+1;
        }
        System.out.println(count);
    }
}
