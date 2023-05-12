import java.util.*;
public class LightsOut 
{
    Scanner sc = new Scanner(System.in);
    int op[][] = {{1,1,1},{1,1,1},{1,1,1}};
    int ip[][] = new int[3][3]; 
    public static void main(String args[])
    {
        LightsOut l = new LightsOut();
        l.process();
    } 
    public void process()
    {
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                ip[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                if(ip[i][j]%2 == 1)
                {
                    op[i][j] = op[i][j]==1?0:1;
                    if(i+1<3)
                        op[i+1][j] = op[i+1][j]==1?0:1;
                    if(i-1>-1)
                        op[i-1][j] = op[i-1][j]==1?0:1;
                    if(j+1<3)
                        op[i][j+1] = op[i][j+1]==1?0:1;
                    if(j-1>-1)
                        op[i][j-1] = op[i][j-1]==1?0:1;
                }
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(op[i][j]);
            }
            System.out.println();
        }
    }  
}
