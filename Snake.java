import java.util.*;
public class Snake
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Snake s = new Snake();
        s.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(i%2 == 0 || j == x)
                    System.out.print("#");
                else
                    System.out.print(".");
            }
            System.out.println();
            if(x == m-1 && i%2 == 0)
                x = 0;
            else if(x == 0 && i%2 == 0)
                x = m-1;
        }
    }
}
