//165A
import java.util.*;
public class Supercentral_Point 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Supercentral_Point sp = new Supercentral_Point();
        sp.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        int count = 0;
        boolean right = false, left = false, up = false, down = false;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<2; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++)
        {
            up = false;
            down = false;
            right = false;
            left = false;
            for(int j = 0; j<n; j++)
            {
                if(i==j)
                    continue;
                if(arr[i][0]>arr[j][0] && arr[i][1]==arr[j][1])
                    right = true;
                if(arr[i][0]<arr[j][0] && arr[i][1]==arr[j][1])
                    left = true;
                if(arr[i][0]==arr[j][0] && arr[i][1]<arr[j][1])
                    down = true;
                if(arr[i][0]==arr[j][0] && arr[i][1]>arr[j][1])
                    up = true; 
            }
            if(up == true && down == true && right == true && left == true)
                count++;
        }
        System.out.println(count);
    }
}
