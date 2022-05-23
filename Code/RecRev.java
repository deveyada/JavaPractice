package Code;

public class RecRev {
    int sum = 0;
    public int test(int a) {
        if (a>0)
        {
            sum = a+test(a-1);
            return sum;
        }
        else
        return 0;

    }
    public static void main(String[] args)
    {
        RecRev rt = new RecRev();
        rt.test(10);
    }
}
