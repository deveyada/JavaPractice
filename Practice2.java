public class Practice2 {
    public static void main (String[] args) {
        int[] arr = {1,2,4,5,9};
        int num = 0;
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++)
        {

            if (arr[i]%2 == 0)
            {
                num += 1;
            }
            else
            {
                num += 3;
            }

        }
        System.out.println("The sum of the elements in an array is " + num);
    }
}
