import java.util.*;
public class Watermelon {
    Scanner sc = new Scanner(System.in);
    int w;
    public void check()
    {
        w = sc.nextInt();
        if(w>=1 && w<=100)
        {
            if(w%2 == 0 && w != 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    public static void main(String[] args)
    {
       Watermelon w = new Watermelon();
       w.check();
    } 
}
