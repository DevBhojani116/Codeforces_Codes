import java.util.*;
public class Blackjack 
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Blackjack b = new Blackjack();
        b.process();
    }
    public void process()
    {
        int n = sc.nextInt()-10;
        int x = 0;
        switch(n)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                x = 4;
                break;
            case 10:
                x = 15;
                break;
            default:
                x = 0;
        }
        System.out.println(x);
    }
}
