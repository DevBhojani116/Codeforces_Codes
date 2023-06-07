//	496A - Minimum Difficulty
import java.util.*;
public class Minimum_Difficulty
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Minimum_Difficulty md = new Minimum_Difficulty();
        md.process();
    }
    public void process()
    {
        int n = sc.nextInt(); //number of holds
        int arr[] = new int[n];
        int min = (int)Math.pow(2,32)-1; 
        //initialising the initial array of distances of holds
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        //performing operations on new arrays in which one hold is removed
        int temp[] = new int[n-1];
        for(int i = 1; i<n-1; i++)
        {
            int c = 0;
            for(int j = 0; j<n; j++)
            //removing one hold and copying the remaining holds
            {
                if(i == j)
                {
                    continue;
                }
                else
                {
                    temp[c] = arr[j];
                    c++; 
                }
            }
            //finding out the minimum difficulty set 
            min = Math.min(mx(temp),min);
        }
        System.out.println(min);
    }
    public int mx(int arr[])
    //function to find out the max difference of the given array
    {
        int max = 0;
        for(int i = 1; i<arr.length; i++)
        {
            max = Math.max(max,(arr[i]-arr[i-1]));
        }
        return max;
    }
}