public class ConstructTest {
    int length = 12;
    int breadth = 8;
    public ConstructTest(int l, int b)
    {
        this.length = l;
        this.breadth = b;
        System.out.println("The area of rectangle is "+ (length*breadth));
    }
    public static void main(String[]args)
    {
        ConstructTest ct = new ConstructTest(26,3);
    }

}
