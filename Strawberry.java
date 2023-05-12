import java.util.*;
public class Strawberry
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])   
    {
        Strawberry str = new Strawberry();
        str.process();
    }
    public void process()
    {
        int r = sc.nextInt();
        int c = sc.nextInt();
        char arr[][] = new char[r][c];
        String rows[] = new String[r];
        sc.nextLine();
        for(int i = 0; i<r; i++)
            rows[i] = sc.nextLine(); 
        for(int i = 0; i<r; i++)
        {
            for(int j = 0; j<c; j++)
            {
                arr[i][j] = rows[i].charAt(j);
            }
        }
        int count = 0;
        for(int i = 0; i<r; i++)
        {
            int x = 0;
            for(int j = 0; j<c; j++)
            {
                if(arr[i][j] == 'S')
                {
                    x++;
                    break;
                }
            }
            if(x!=0)
                continue;
            else
            {
                for(int k = 0; k<c; k++)
                {
                    if(arr[i][k] == '.')
                        count++;
                    arr[i][k] = 'x';
                }
            }
        }
        for(int i = 0; i<c; i++)
        {
            int x = 0;
            for(int j = 0; j<r; j++)
            {
                if(arr[j][i] == 'S')
                {
                    x++;
                    break;
                }
            }
            if(x!=0)
                continue;
            else
            {
                for(int k = 0; k<r; k++)
                {
                    if(arr[k][i] == '.')
                        count++;
                    arr[k][i] = 'x';
                }
            }
        }
        System.out.println(count);
    }
}
