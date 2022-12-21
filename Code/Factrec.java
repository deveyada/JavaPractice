package Code;

public class Factrec {

    int temp;
    public int fact(int a)
    {
        if(a>1)

            temp = a * fact(a-1);

        return temp;
    }

    public static void main (String[] args) {
        Factrec a = new Factrec();
        a.fact(5);

    }
}