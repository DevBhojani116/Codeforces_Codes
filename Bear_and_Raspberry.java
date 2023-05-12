import java.util.*;
public class Bear_and_Raspberry
{
       Scanner sc = new Scanner(System.in);
       public static void main(String args[])
       {
            Bear_and_Raspberry bar = new Bear_and_Raspberry();
            bar.process();
       }
       public void process()
       {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int day_rates[] = new int[n];
            int profit = 0;
            for(int i = 0; i<n; i++)
            {
                day_rates[i] = sc.nextInt();
            }
            for(int i = 0; i<n-1; i++)
            {
                if(day_rates[i]>day_rates[i+1])
                {
                    profit = Math.max(profit,day_rates[i]-day_rates[i+1]-c);
                }
            }
            System.out.println(profit);
       }
}
