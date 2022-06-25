import java.util.ArrayList;
import java.util.ListIterator;

public class IterateDemo {
    public static void main (String[]args) {
        ArrayList<String> alr = new ArrayList();
        alr.add("test.email+a@thoughtworks.com");
        alr.add("test.e.mail+b.c@thoughtworks.com");
        alr.add("testemail+d@thought.works.com");
        alr.add("a@thoughtworks.com");
        alr.add("b@thoughtworks.com");
        alr.add("c@thoughtworks.com");
        ListIterator<String> li = alr.listIterator();
        if (li.hasNext())
        {
            System.out.println(alr);
        }
    }
}
