public class MethodTest {
    public int test(int a)
    {
        return a;
    }
    public static void main (String[]args)
    {
        MethodTest mt = new MethodTest();
        int result = mt.test(10);
        System.out.println(result);

    }
}
