import java.util.*;
public class General 
{
    Scanner sc = new Scanner(System.in);
    int arr[];
    public static void main(String args[])
    {
        General g = new General();
        g.process();
    }   
    public void process()
    {
        arr = new int[sc.nextInt()];
        for(int i = 0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        int max = arr[0]; int min = arr[0];
        int maxp = 0, minp = 0;
        for(int i = 1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                maxp = i;
            }
            else if(arr[i]<=min)
            {
                min = arr[i];
                minp = i;
            }
        }
        if(minp<maxp)
            System.out.println((maxp+(arr.length-1-minp)-1));
        else
            System.out.println((maxp+(arr.length-1-minp)));
    }
}
