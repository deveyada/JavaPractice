package javapracticee;

import java.util.*;

public class collectionsAL {

	public void arraylist() {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Violet");
	al.add("Indigo");
	al.add("Blue");
	al.add("Green");
	al.add("Yellow");
	al.add("Orange");
	al.add("Red");
	al.add(7,"VIBGYOR");
	
	System.out.println("The contents of arraylist are " + al);
	System.out.println("The size of the arraylist is " + al.size());
	System.out.println("Fourth element is " + al.get(3));
	System.out.println("Replacement of first index "+ al.set(0, "Purple"));
	System.out.println("Removing third element "+al.remove(3));
	System.out.println("Contents after removal "+al);
	
	
	for (int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	Collections.sort(al);
	System.out.println("The sorted arraylist looks like "+al);
	}
	public static void main(String[]args) {
		collectionsAL obj = new collectionsAL();
		obj.arraylist();
	}
	

}
