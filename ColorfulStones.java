import java.util.*;
public class ColorfulStones
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        ColorfulStones cs = new ColorfulStones();
        cs.process();
    }
    public void process()
    {
        String s = sc.nextLine();
        String t = sc.nextLine();
        int c = 1;
        for(int i = 0; i<t.length(); i++)
        {
            if(t.charAt(i) == s.charAt(c-1))
                c++;
        }
        System.out.println(c);
    }
}
