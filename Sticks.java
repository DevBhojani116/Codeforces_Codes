import java.util.*;
public class Sticks 
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        Sticks s = new Sticks();
        s.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        x = 1;
        while(n != 1 && m != 1)
        {
            x = x==2?1:2;
            n--;
            m--; 
        }
        System.out.println(x==1?"Akshat":"Malvika");
    }
}
