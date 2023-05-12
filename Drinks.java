import java.util.*;
public class Drinks
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Drinks d = new Drinks();
        d.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        double arr[] = new double[n];
        double sum = 0;
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }
        System.out.println(sum/n);
    }
}
