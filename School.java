import java.util.*;
public class School 
{
    Scanner sc = new Scanner(System.in);
    public void process()
    {
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next(), s1 = "";
        if(n>=1 && n<=50 && t>=1 && t<=50)
        {
            for(int i = 1; i<=t; i++)
            {
                s1 = "";
                for(int j = 0; j<s.length(); j++)
                {
                    if(s.charAt(j) == 'B' && j!=s.length()-1 && s.charAt(j+1) == 'G')
                    {
                        s1 += "GB";
                        j++;
                    }
                    else
                        s1 += s.charAt(j);
                }
                s = s1;
            }
            System.out.println(s1);
        }
    }
    public static void main(String args[])
    {
        School s = new School();
        s.process();
    }
}
