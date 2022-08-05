package Collection;

import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapCustomisedSort {
       public static void main(String[] args) {
    	   TreeMap t= new TreeMap(new MyComparator());
    	   t.put("Keshav",1);
    	   t.put("Shyam",6);
    	   t.put("Ashutosh",5);
    	   t.put("Manish",3);
    	   t.put("Aditya",4);
    	   System.out.println(t);
       }
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
