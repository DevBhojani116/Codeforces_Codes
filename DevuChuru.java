import java.util.*;
public class DevuChuru
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        DevuChuru dc = new DevuChuru();
        dc.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        int d = sc.nextInt();
        int min[] = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            min[i] = sc.nextInt();
            sum += min[i];
        }
        if((n-1)*10 + sum > d)
        {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println((d-sum)/5);
    }
}
