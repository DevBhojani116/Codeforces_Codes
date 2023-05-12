import java.util.*;
public class Valera_and_Antique_Items 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Valera_and_Antique_Items v = new Valera_and_Antique_Items();
        v.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int v = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            int k = sc.nextInt();
            for(int j = 0; j<k; j++)
            {
                int s = sc.nextInt();
                if(s<v)
                    arr[i] = i+1;
            }
        }
        int count = 0;
        for(int i = 0; i<n; i++)
            if(arr[i] != 0)
                count++;
        System.out.println(count);
        for(int i = 0; i<n; i++)
            if(arr[i] != 0)
                System.out.print(arr[i] + " ");
                
    }
}
