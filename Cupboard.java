import java.util.*;
public class Cupboard
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Cupboard c = new Cupboard();
        c.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        int l0 = 0, r0 = 0, l1 = 0, r1 = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<2; j++)
            {
                arr[i][j] = sc.nextInt();
                if(j == 0 && arr[i][j] == 0)
                    l0++;
                else if(j == 0 && arr[i][j] == 1)
                    l1++;
                else if(j == 1 && arr[i][j] == 0)
                    r0++;
                else if(j == 1 && arr[i][j] == 1)
                    r1++;
            }
        }
        System.out.println((l1<l0?l1:l0) + (r1<r0?r1:r0));
    }
}
