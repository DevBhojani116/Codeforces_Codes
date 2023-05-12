import java.util.*;
public class Year
{
    int y;
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Year y = new Year();
        y.process();
    }
    public void process()
    {
        y = sc.nextInt();
        if(y>=1000 && y<=9000)
        {
            int a = 0, b = 0, c = 0, d = 0;
            for(int i = y+1;;i++)
            {
                a = (i/1000)%10;
                b = (i/100)%10;
                c = (i/10)%10;
                d = (i/1)%10;
                if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
