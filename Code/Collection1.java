package Code;

import java.util.ArrayList;

public class Collection1 {
    static int q=2;
    public static void main (String[]args)
    {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("The original arraylist is: "+al);
        if(q==1)
        {
            int p=2;
            int r=10;
            al.add(p,r);
            System.out.println("When q  equals 1 then arraylist is: "+al);
        }
        else
        {
            int p=50;
            if(al.contains(p))
            {
                System.out.println("p is found at: "+al.indexOf(p));
            }
            else {
                System.out.println("-1");
            }
        }
    }
}
