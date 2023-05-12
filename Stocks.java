import java.util.*;
class Stocks
{
    Scanner sc = new Scanner(System.in);
    static int prices[] = {7,6,8,3,1};
    public static void main(String args[])
    {
        int profit = 0, min = prices[0], max = 0;
        for(int i = 0; i<prices.length; i++)
        {
            profit = prices[i] - min;
            min = Math.min(prices[i],min);
            max = Math.max(max,profit);
        }
        System.out.println(max);
    }
}

