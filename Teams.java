import java.util.*;
public class Teams 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Teams t = new Teams();
        t.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int c = 0;
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt() + k;
            if(arr[i] <= 5)
                c++;
        }
        System.out.println(c/3);
    }
}
