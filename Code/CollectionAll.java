package Code;

import java.util.*;

public class CollectionAll {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(21);
        ll.add("Devesh");
        ll.add("Divisha");
        ll.add(29);
        ll.addFirst("Names");
        ll.addLast(100);
        ll.offerFirst(1);
        ll.offerLast("Shweta");
        System.out.println(ll);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(23);
        al.add(12);
        al.add(10);
        al.add(9);
        al.add(8);
        al.add(55);
        System.out.println(al);
        for(int n:al)
        {
            if(al.contains(10))
            {
                System.out.println("The index of 10 is: "+al.indexOf(10));
                break;
            }
        }
        Set<Integer> s = new HashSet<Integer>(al);
        System.out.println(s);
        HashSet<Integer> hs = new HashSet<Integer>(20,0.8f);
        hs.add(42);
        hs.add(23);
        hs.add(29);
        hs.add(31);
        System.out.println(hs);


        }
    }