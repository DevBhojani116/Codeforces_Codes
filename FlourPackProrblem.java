import java.util.*;
class FlourPackProblem
 {
    int goal, smallCount, bigCount;
    Scanner sc = new Scanner(System.in);
    public void canPack()
    {
        System.out.println("Enter the count of big flour bags(5 kg)");
        bigCount = sc.nextInt();
        System.out.println("Enter the count of small flour bags(1 kg)");
        smallCount = sc.nextInt();
        System.out.println("Enter the goal");
        goal = sc.nextInt();
        if(goal<0 || bigCount<0 || smallCount<0)
        {
            System.out.println("Error in data input");
            System.exit(0);
        }
        if(goal%5 > smallCount)
        {
            System.out.println("Not Possible");
        }
        else
        {
            goal -= goal%5;
            smallCount -= goal%5;
            if(goal/5 <= bigCount)
            {
                System.out.println("Possible");
            }
            else
            {
                if(goal-bigCount*5 > smallCount)
                {
                    System.out.println("Not Possible");
                }
                else
                {
                    System.out.println("Possible");
                }
            }
        }
    }
    public static void main(String args[])
    {
        FlourPackProblem f = new FlourPackProblem();
        f.canPack();
    }
}
