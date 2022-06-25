import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ques1 {
    public static void main(String[]args)
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Blue");
        al.add("Green");
        al.add("Red");
        al.add("Orange");
        System.out.println(al);
        Iterator<String> itr = al.iterator();
        while(itr.hasNext())
        {
            if(itr.next()=="Blue")
            {
                itr.remove();
            }
        }
        System.out.println(al);
        al.add(0,"Gold");
        System.out.println(al);
        System.out.println(al.get(2));
        al.set(2,"Black");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        ArrayList<String> arl = new ArrayList<String>();
        arl.addAll(al);
        System.out.println("Copied arraylist is "+arl);
    }
}
