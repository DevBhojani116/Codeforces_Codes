import java.util.*;
public class IQ 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        IQ iq = new IQ();
        iq.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        int oddi = 0;
        int eveni = 0;
        int x = 0;
        for(int i = 0; i<n; i++)
        {
            x = sc.nextInt();
            if(x%2 == 0)
            {
                even++;
                eveni = i+1;
            }
            else
            {
                odd++;
                oddi = i+1;
            }
        }
        if(even<odd)
            System.out.println(eveni);
        else
            System.out.println(oddi);
    }
}
