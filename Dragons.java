import java.util.*;
public class Dragons
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Dragons d = new Dragons();
        d.process();
    }   
    public void process()
    {
        int s = sc.nextInt();
        int n = sc.nextInt();
        int health[] = new int[n];
        int bonus[] = new int[n];
        for(int i = 0; i<n; i++)
        {
            health[i] = sc.nextInt();
            bonus[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < n; j++){  
                if (health[j] < health[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = health[index];   
            health[index] = health[i];  
            health[i] = smallerNumber;  

            int temp = bonus[index];
            bonus[index] = bonus[i];
            bonus[i] = temp;
        }  
        for(int i = 0; i<n; i++)
        {
            if(s<=health[i])
            {
                System.out.println("NO");
                System.exit(0);
            }
            else
            {
                s += bonus[i];
            }
        }
        System.out.println("YES");
    }
}
