import java.util.*;
public class Laptops 
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        Laptops l = new Laptops();
        l.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        int quality[] = new int[n];
        int price[] = new int[n];
        float ratio[] = new float[n];
        for(int i = 0; i<n; i++)
        {
            price[i] = sc.nextInt();
            quality[i] = sc.nextInt();
            ratio[i] = (float)quality[i]/price[i];
        }

        for(int i = 0; i<n; i++)
        {
            if(ratio[i]>1 && price[i]<Arrays.stream(price).max().getAsInt())
            {
                System.out.println("Happy Alex");
                System.exit(0);
            }
        }
        System.out.println("Poor Alex");

    }
}
