import java.util.*;
public class Soft_Drink 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Soft_Drink sd = new Soft_Drink();
        sd.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int klmin = (k*l)/nl;
        int cdmin = c*d;
        int npmin = p/np;
        System.out.println((int)(Math.min(klmin,Math.min(cdmin,npmin))/n));
    }
}
