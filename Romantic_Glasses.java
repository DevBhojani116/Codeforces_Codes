import java.util.*;
public class Romantic_Glasses
{
    Scanner sc = new Scanner(System.in);
    public void process()
    {
        int t = sc.nextInt();
        outerloop: for(int task = t; task>0; task--)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i<n; i++)
            {
                arr[i] = sc.nextInt();
                if(i%2 == 0)
                    arr[i] *= -1;
            }
            HashMap<Long, Integer> map = new HashMap<>();
            long sum = 0;
            for(int i = 0; i<n; i++)
            {
                sum += arr[i];
                if(sum == 0 || map.containsKey(sum))
                {
                    System.out.println("YES");
                    continue outerloop;
                }
                else
                    map.put(sum,i);
            }
            System.out.println("NO");
        }
    }
    public static void main(String args[])
    {
        Romantic_Glasses s = new Romantic_Glasses();
        s.process();
    }
}
