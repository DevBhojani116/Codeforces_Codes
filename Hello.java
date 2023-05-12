import java.util.*;
public class Hello 
{
   Scanner sc = new Scanner(System.in);   
   public static void main(String args[])
   {
        Hello h = new Hello();
        h.process();
   }
   public void process()
   {
        String s = sc.next().toLowerCase();
        int a = 0;
        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'h' && a == 0)
                a++;
            else if(s.charAt(i) == 'e' && a == 1)
                a++;
            else if(s.charAt(i) == 'l' && a == 2)
                a++;
            else if(s.charAt(i) == 'l' && a == 3)
                a++;
            else if(s.charAt(i) == 'o' && a == 4)
                a++;
        }
        System.out.println(a==5?"YES":"NO");
   }
}
