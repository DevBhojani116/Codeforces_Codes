import java.util.*;
public class Mathematician
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Mathematician m = new Mathematician();
        m.process();
    }
    public void process()
    {
        String num1 = sc.next();
        String num2 = sc.next();
        String num3 = "";
        for(int i = 0; i<num1.length(); i++)
        {
            if(num1.charAt(i) == num2.charAt(i))
                num3 += 0;
            else
                num3 += 1;
        }
        System.out.println(num3);
    }
}