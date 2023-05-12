import java.util.*;
public class Expression 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Expression e = new Expression();
        e.process();
    }
    public void process()
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(Math.max(a+b*c,a*b+c),Math.max(a*b*c,a+b+c)),Math.max(a*(b+c),(a+b)*c));
        System.out.println(max);
    }
}
