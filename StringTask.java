import java.util.*;
public class StringTask 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        StringTask s = new StringTask();
        s.process();
    }   
    public void process()
    {
        String s = sc.next().toLowerCase();
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
                continue;
            else
                System.out.print("." + c);
        }
    }
}
