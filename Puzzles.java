import java.util.*;
public class Puzzles
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Puzzles p = new Puzzles();
        p.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i = 0; i<m; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[n-1] - arr[0];
        for(int i = 0; i<m-n+1; i++)
        {
            if(arr[i+n-1]-arr[i]<min)
            {
                min = arr[i+n-1] - arr[i];
            }
        }
        System.out.println(min);
    }
}