public class Swap {
    public static void main(String args[])
    {
        int arr[] = {2,4,6,8};
        int arr1[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            arr1[i] = arr[i];
        }
        for(int i = 0; i<arr1.length/2; i++)
        {
            int temp = arr[i];
            arr1[i] = arr1[arr1.length-i-1];
            arr1[arr.length-i-1] = temp;
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i<arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }
    }  
}
