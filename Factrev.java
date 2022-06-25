public class Factrev {
    public int test(int a) {
        if (a > 1) {
            a = a * test(a - 1);
            return a;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Factrev fr = new Factrev();
        int result = fr.test(6);
        System.out.println(result);
    }
}
