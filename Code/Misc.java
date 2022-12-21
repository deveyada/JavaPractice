package Code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Misc {
    public void test(int[] array)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<=array.length-1;i++)
        {
            al.add(array[i]);
        }
        System.out.println("the arraylist from array is: "+al);
    }

    public static void main(String[] args) {
        Misc obj = new Misc();
        int[] arr = {1,23,4,41,10,9};
        obj.test(arr);
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(9);
        al2.add(12);
        al2.add(22);
        al2.add(10);
        System.out.println(al2);
        Object[] arr1 = al2.toArray();
        for(Object obj1 : arr1) {
            System.out.print(obj1 + " ");
        }
    }
}
