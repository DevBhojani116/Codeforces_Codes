import java.util.*;
public class Appleman
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Appleman a = new Appleman();
        a.process();
    }
    public void process()
    {
        int n = sc.nextInt();
        sc.nextLine();
        char arr[][] = new char[n][n];
        int x = 0;
        String rows[] = new String[n];
        for(int i = 0; i<n; i++)
            rows[i] = sc.nextLine(); 
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                arr[i][j] = rows[i].charAt(j);
            }
        }
        for(int i = 0; i<n; i++)
        {
            x = 0;
            for(int j = 0; j<n; j++)
            {
                if(i>0 && arr[i-1][j] == 'o')
                {
                    x++;
                }
                if(i<n-1 && arr[i+1][j] == 'o')
                {
                    x++;
                }
                if(j>0 && arr[i][j-1] == 'o')
                {
                    x++;
                }   
                if(j<n-1 && arr[i][j+1] == 'o')
                {
                    x++;
                }
                if(x%2 != 0)
                {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("YES");
    }
}
