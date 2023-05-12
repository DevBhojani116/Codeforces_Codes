import java.util.*;
public class Lexicograph 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Lexicograph l = new Lexicograph();
        l.process();
    } 
    public void process()
    {
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        int x = 0;
        for(int i = 0; i<s1.length(); i++)
        {
            if(s1.charAt(i)-s2.charAt(i) < 0)
            {
                x = -1;
                break;
            }   
            else if(s1.charAt(i) == s2.charAt(i))
                continue;
            else
            {
                x = 1;
                break;
            }
        }
        System.out.println(x);
    }
}
