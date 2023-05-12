import java.util.*;
public class Stones 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Stones s = new Stones();
        s.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        String s = sc.next();
        int x = 0;
        for(int i = 0; i<n-1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
                x++;
        }
        System.out.println(x);
    }
}
