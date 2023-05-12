import java.util.*;
public class Word 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Word w = new Word();
        w.process();
    }   
    public void process()
    {
        String s = sc.next();
        int u = 0, l = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                u++;
            else    
                l++;
        }
        if(u>l)
            s = s.toUpperCase();
        else
            s = s.toLowerCase();
        System.out.println(s);
    }
}
