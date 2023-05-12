import java.util.*;
public class Presents
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        Presents p = new Presents();
        p.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x = 0;
        for(int i = 1; i<=n; i++)
        {
            x = sc.nextInt();
            arr[x-1] = i;
        }
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
