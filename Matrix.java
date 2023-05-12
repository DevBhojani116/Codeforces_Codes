import java.util.*;
public class Matrix {
    Scanner sc = new Scanner(System.in);
    public void process()
    {
        int x = 0, y = 0, n = 0;
        for(int i = 0; i<5; i++)
        {
            for(int j = 0; j<5; j++)
            {
                n = sc.nextInt();
                if(n == 1)
                {
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(Math.abs(x-2) + Math.abs(y-2));
    }
    public static void main(String args[])
    {
        Matrix m = new Matrix();
        m.process();
    }
}
