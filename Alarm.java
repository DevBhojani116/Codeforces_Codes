import java.util.*;
public class Alarm
{
    Scanner sc = new Scanner(System.in);
    public void process()
    {
        int arrx[] = new int[101];
        int arry[] = new int[101];
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            int k = sc.nextInt();
            int j = sc.nextInt();
            arrx[k] = 1;
            arry[j] = 1;
        }
        int countx = 0;
        int county = 0;
        for(int i = 0; i<101; i++)
        {
            if(arrx[i] == 1)
                countx++;
            if(arry[i] == 1)
                county++;
        }
        System.out.println(Math.min(countx,county));
    }
    public static void main(String args[])
    {
        Alarm a = new Alarm();
        a.process();
    }
}