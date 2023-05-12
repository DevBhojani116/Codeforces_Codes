import java.util.*;
public class Lunch
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Lunch l = new Lunch();
        l.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int f[] = new int[n];
        int t[] = new int[n];
        int res_f[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            f[i] = sc.nextInt();
            t[i] = sc.nextInt(); 
            if(t[i]<k)
                res_f[i] = f[i];
            else
                res_f[i] = f[i]-(t[i]-k); 
        }
        Arrays.sort(res_f);
        System.out.println(res_f[n-1]);
    }
}
