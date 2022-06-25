public class Factorialrev {
    int result;

    public int factorial(int i)
    {
        if (i>1){
            result = i * factorial(i-1);
        }
        else{
            result=1;
        }
        return result;
    }

    public static void main (String[] args) {
        Factorialrev fr = new Factorialrev();
        int answer = fr.factorial(5);
        System.out.println(answer);
    }
}

