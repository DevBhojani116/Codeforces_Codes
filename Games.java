import java.util.*;
public class Games 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Games g = new Games();
        g.process();
    }   
    public void process()
    {
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<2; j++)
                arr[i][j] = sc.nextInt();
        }
        int c = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(arr[i][0] == arr[j][1] && i!= j)
                    c++;
            }
        }
        System.out.println(c);
    }
}
