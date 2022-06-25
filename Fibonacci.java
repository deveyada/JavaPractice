public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        int c;
        for (int i = 0; i <= 8; i++) {
            c = a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
