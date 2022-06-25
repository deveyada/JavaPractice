import java.util.ArrayList;
import java.util.ListIterator;

public class Twcode {
    public static void main (String[]args) {
        ArrayList<String> al = new ArrayList();
        al.add("test.email+a@thoughtworks.com");
        al.add("tester.e.mail+b.c@thoughtworks.com");
        al.add("testeremail+d@thought.works.com");
        al.add("a@thoughtworks.com");
        al.add("b@thoughtworks.com");
        al.add("c@thoughtworks.com");
        ListIterator<String> litr = al.listIterator();
        if (litr.hasNext()) {
            if (al.contains("@")) {
                String s[] = litr.next().split("@");

                //System.out.println(s[0]);
                if(s[0].contains("+"))
                {
                    String[] s1 = s[0].split("[+]");
                    if (s1[0].contains(".")) {
                        String s2 = s1[0].replace(".", "");
                        System.out.println(s2+"@"+s[1]);
                    }
                }
                else {
                    System.out.println(s[0] + s[1]);
                }
            }
        }

    }
}
