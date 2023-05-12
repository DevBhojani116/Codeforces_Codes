import java.util.*;
public class Borze 
{
    Scanner sc = new Scanner(System.in);
    public void process()
    {
        String s = sc.nextLine();
        String s1 = "";
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '.')
                s1 += "0";
            else if(i != s.length()-1 && s.charAt(i) == '-' && s.charAt(i+1) == '-')
            {
                s1 += "2";
                i++;
            }
            else
            {
                s1 += "1";
                i++;
            }
        }
        System.out.println(s1);
    }
    public static void main(String args[])
    {
        Borze b = new Borze();
        b.process();
    }
}
