import java.util.*;
public class Letters
{
    Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        Letters l = new Letters();
        l.process();
    }
    public void process()
    {
        String input = sc.nextLine().toLowerCase();
        String temp = "";
        for(int i = 1; i<input.length()-1; i++)
        {
            if(input.charAt(i)>='a' && input.charAt(i)<='z')
            {
                temp += input.charAt(i);
            }
        }
        temp += " ";
        char arr[] = new char[temp.length()];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = temp.charAt(i);
        }
        Arrays.sort(arr,0,temp.length()-1);
        int count = 0;
        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i] != arr[i+1])
                count++;
        }
        System.out.println(count);
    }
}
