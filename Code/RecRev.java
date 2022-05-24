package Code;

public class RecRev {

       public static int test(int a) {
           int sum = 0;
        if (a>0)
        {
            sum= a+test(a-1);
            return sum;

        }
        else
        return 0;

    }
    public static void main(String[] args)
    {
        RecRev rt = new RecRev();
        int result = rt.test(10);
        System.out.println(result);
    }
}
