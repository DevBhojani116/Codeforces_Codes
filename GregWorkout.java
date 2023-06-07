// 255A Greg's Workout
import java.util.*;
public class GregWorkout 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        GregWorkout gw = new GregWorkout();
        gw.process();
    }
    public void process()
    {
        int n = sc.nextInt();//number of exercises
        int arr[] = new int[3];//array to store the number of times greg has performed a particular exercise
        for(int i = 0; i<n; i++)
        //0 for chest, 1 for biceps and 2 for back
        {
            arr[i%3] += sc.nextInt();
        }
        int max = arr[((arr[0]>arr[1])?0:1)]>arr[2]?((arr[0]>arr[1])?0:1):2;//finding out which exercise has he performed max
        //declaring his strongest muscle based on the above result
        if(max == 0)
            System.out.println("chest");
        if(max == 1)
            System.out.println("biceps");
        if(max == 2)
            System.out.println("back");
    }
}
