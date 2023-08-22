import java.util.*;
public class Playing_with_Dice 
{
    Scanner sc = new Scanner(System.in);   
    public static void main(String args[])
    {
        Playing_with_Dice pwd = new Playing_with_Dice();
        pwd.process();
    }
    public void process()
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int awin = 0;
        int bwin = 0;
        int draw = 0;
        for(int i = 1; i<=6; i++)
        {
            if(Math.abs(a-i) == Math.abs(b-i))
                draw++;
            else if(Math.abs(a-i) >= Math.abs(b-i))
                bwin++;
            else if(Math.abs(a-i) <= Math.abs(b-i))
                awin++;
        }
        System.out.println(awin + "\t" + draw + "\t" + bwin);
    }
}
