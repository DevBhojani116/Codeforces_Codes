import java.util.*;
public class Cards 
{
    Scanner sc = new Scanner(System.in);
    public void process()
    {
        int n = sc.nextInt();
        String s = sc.next();
        int one = 0, zero = 0;
        for(int i = 0; i<n; i++)
        {
            if(s.charAt(i) == 'z')
                zero++;
            else if(s.charAt(i) == 'n')
                one++;
        }
        for(int i = 0; i<one; i++)
            System.out.print(1 + " ");
        for(int i = 0; i<zero; i++)
            System.out.print(0 + " ");
    }
    public static void main(String args[])
    {
        Cards c = new Cards();
        c.process();
    }
}
