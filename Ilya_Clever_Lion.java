import java.util.*;
public class Ilya_Clever_Lion 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Ilya_Clever_Lion icl = new Ilya_Clever_Lion();
        icl.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        if(n>0)
            System.out.println(n);
        else
        {
            String s = Integer.toString(n);
            String s1 = s.substring(0,s.length()-1);
            String s2 = s.substring(0,s.length()-2) + s.charAt(s.length()-1);
            if(Integer.parseInt(s1)>Integer.parseInt(s2))
                if(s1.equalsIgnoreCase("-0"))
                    System.out.println("0");
                else
                    System.out.println(s1);
            else
                if(s2.equalsIgnoreCase("-0"))
                    System.out.println("0");
                else
                    System.out.println(s2);
        }
    }
}
