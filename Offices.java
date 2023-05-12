import java.util.*;
public class Offices 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Offices o = new Offices();
        o.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        String s = sc.next();
        int x = 0;
        for(int i = 0; i<n-1; i++)
        {
            if(s.charAt(i) == 'S' && s.charAt(i+1) == 'F')
                x++;
            if(s.charAt(i) == 'F' && s.charAt(i+1) == 'S')
                x--;
        }
        System.out.println(x>0?"YES":"NO");
    }
}
