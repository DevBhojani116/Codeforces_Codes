import java.util.*;
public class TooLong
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        TooLong t = new TooLong();
        t.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.next().toLowerCase();
        }
        for(int i = 0; i<n; i++)
        {
            if(arr[i].length()>10)
                System.out.println(arr[i].charAt(0) + "" + (arr[i].length()-2) + arr[i].charAt(arr[i].length()-1));
            else
                System.out.println(arr[i]);
        }
    }
}
