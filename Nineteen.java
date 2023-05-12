import java.util.*;
public class Nineteen 
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        Nineteen n = new Nineteen();
        n.process();
    }
    public void process()
    {
        int n = 0, i = 0, e = 0, t = 0;
        String s = sc.nextLine();
        for(int j = 0; j<s.length(); j++)
        {
            switch(s.charAt(j))
            {
                case 'n':
                    n++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'e':
                    e++;
                    break;
                case 't':
                    t++;
                    break;
                default:
                    continue;
            }
        }
        if(n-3>0)
            n = (n-3)/2 + 1;
        else
            n = n/3;
        e = e/3;
        System.out.println(Math.min(Math.min(n,i),Math.min(e,t)));
    }
}