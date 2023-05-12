import java.util.*;
public class Twins
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Twins t = new Twins();
        t.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    arr[j] = arr[j] + arr[i];
                    arr[i] = arr[j] - arr[i];
                    arr[j] = arr[j] - arr[i]; 
                }
            }
        }
        int x = 0;
        for(int i = 0; i<arr.length; i++)
        {
            x += arr[i];
            if(x>sum-x)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
