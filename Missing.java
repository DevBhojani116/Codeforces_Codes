import java.util.*;
public class Missing 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Missing m = new Missing();
        m.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i = 0; i<n; i++)
            ar[i] = i+1;
        int inp[] = new int[n-1];
        for(int i = 0; i<n-1; i++)
        {
            inp[i] = sc.nextInt();
            ar[inp[i]-1] = 0;
        }
        for(int i = 0; i<n; i++)
        {
            if(ar[i] != 0)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
