import java.util.*;
public class Physicist 
{
   Scanner sc = new Scanner(System.in);
   int n;
   public static void main(String arg[])
   {
        Physicist p = new Physicist();
        p.calculate();
   }
   public void calculate()
   {
        n = sc.nextInt();
        int x = 0, y = 0, z = 0;
        for(int i= 0; i<n; i++)
        {
            x += sc.nextInt();
            y += sc.nextInt();
            z += sc.nextInt();
        }
        if(x == 0 && y == 0 && z == 0)
            System.out.println("YES");
        else   
            System.out.println("NO");
   }
}