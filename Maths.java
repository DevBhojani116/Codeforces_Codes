import java.util.*;
public class Maths 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Maths m = new Maths();
        m.process();
    }
    public void process()
    {
        String s = sc.nextLine().trim();
        int one = 0, two = 0, thr = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '1')
                one++;
            else if(s.charAt(i) == '2')
                two++;
            else if(s.charAt(i) == '3')
                thr++;
        }
        String d = "";
        for(int i = 0; i<one; i++)
            d += "1+";
        for(int i = 0; i<two; i++)
            d += "2+";
        for(int i = 0; i<thr; i++)
            d += "3+";
        System.out.println(d.substring(0,(d.length()-1)));
    }
}
