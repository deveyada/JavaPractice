public class Factorial {

    public long test(long f) {
        long product = 1;
        if (f > 1) {
            product = f * test(f - 1);
        }
        return product;
    }
    public static void main(String[]args)
    {
        Factorial fc = new Factorial();
        long result = fc.test(14);
        System.out.println(result);
    }


}
