import java.util.*;
public class Diagonal
{
    Scanner sc = new Scanner(System.in);
    public void process()
    {
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
                arr[i][j] = sc.nextInt();
        }
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        int max1 = 0;
        int arr1[] = new int[r-1+c-1+1];
        int arr2[] = new int[r-1+c-1+1];
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                arr1[i+j] += arr[i][j];
            }
        }
        max1 = Arrays.stream(arr1).max().getAsInt();
        int x = 0;
        for(int i = 0; i<r; i++)
        {
            x = i;
            for(int j = 0; j<c-i; j++)
            {
                arr2[i] += arr[j][x];
                x++;
            }
        }
        int max2 = Arrays.stream(arr2).max().getAsInt();
        System.out.println("The maximum sum of any diagonal is: " + ((max1>max2)?max1:max2));
    }
    public static void main(String args[])
    {
        Diagonal d = new Diagonal();
        d.process();
    }
}
