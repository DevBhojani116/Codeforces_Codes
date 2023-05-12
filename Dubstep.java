import java.util.*;
public class Dubstep
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        Dubstep d = new Dubstep();
        d.process();
    }
    public void process()
    {
        String s = sc.next().toUpperCase();
        String ans = "";
        int c = 0;
        for(int i = 0; i<s.length()-2; i++)
        {
            if(s.charAt(i) == 'W' && s.charAt(i+1) == 'U' && s.charAt(i+2) == 'B')
            {
                if (c == 0)
                    ans += " ";
                else
                    ans += "";
                i += 2;
                c++;
                continue;
            }
            else
            {
                c = 0;
                ans += s.charAt(i);
            }
            if(i == s.length()-3 && s.charAt(i) != 'W' && s.charAt(i+1) != 'U' && s.charAt(i+2) != 'B')
                ans += "" + s.charAt(i) + s.charAt(i+1) + s.charAt(i+2);
        }   
        System.out.println(ans.trim());
    }
}
