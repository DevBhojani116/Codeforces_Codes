import java.util.*;
public class Pashmak_and_Garden 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Pashmak_and_Garden pag = new Pashmak_and_Garden();
        pag.process();
    }
    public void process()
    {
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if(x1!=x2 && y1!=y2)
        {
            if(Math.abs(x2-x1)==Math.abs(y2-y1))
            {
                System.out.println((x2) +" " + y1 + " " + x1 + " " + (y2));
            }
            else
            {
                System.out.println(-1);
                System.exit(0);
            }
        }
        else
        {
            if(x1!=x2)
            {
                System.out.println(x1 + " " + (y1+x2-x1) + " " + x2 + " " + (y2+x2-x1));
            }
            if(y1!=y2)
            {
                System.out.println((x1+y2-y1) + " " + (y1) + " " + (x2+y2-y1) + " " + (y2));
            }
        }
    }
}
