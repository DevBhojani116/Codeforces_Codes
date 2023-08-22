//TypeDB Forces 2023 (Div. 1 + Div. 2, Rated, Prizes!)
//A
//1787A
import java.util.*;
public class Exponential_Equation 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Exponential_Equation ee = new Exponential_Equation();
        ee.process();
    }  
    public void process()
    {
        int n = sc.nextInt();
        int num[] = new int[n];
        for(int i = 0; i<n; i++)
            num[i] = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            int c = 0;
            int x = 2;
            int y = (int)Math.pow(num[i],1/x);
            if(num[i]%2 == 0)
            {
                System.out.println(1 + " " + num[i]/2);
                c = 1;
            }
            else
            {
                while(y>=x)
                {
                    if(y*Math.pow(x,y)+x*Math.pow(y,x)==num[i])
                    {
                        System.out.println(x + " " + y);
                        c = 1;
                        break;
                    }
                    else if(y*Math.pow(x,y)+x*Math.pow(y,x)>num[i])
                    {
                        y--;
                    }
                    else if(y*Math.pow(x,y)+x*Math.pow(y,x)<num[i])
                    {
                        x++;
                    }
                }
                if(c == 0)
                {
                    System.out.println(-1);
                }
            }
        }
    }
}
