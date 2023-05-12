import java.util.*;
public class I_wanna_be_the_Guy 
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String[] args) 
    {
        I_wanna_be_the_Guy i = new I_wanna_be_the_Guy();
        i.process();
        
    }
    public void process()
    {
        int n = sc.nextInt();
        int arr[] = new int[n];
        int p = sc.nextInt();
        for(int i = 0; i<p; i++)
        {
            arr[sc.nextInt()-1] = 1;
        }
        int q = sc.nextInt();
        for(int i = 0; i<q; i++)
        {
            arr[sc.nextInt()-1] = 1;
        }
        for(int i = 0; i<n; i++)
        {
            if(arr[i] == 0)
            {
                System.out.println("Oh, my keyboard!");
                System.exit(0);
            }
        }
        System.out.println("I become the guy.");
    }
}
