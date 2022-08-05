package Collection;
import java.util.TreeSet;
public class TreeSetExample {
       public static void main(String[] args) {
    	   TreeSet t= new TreeSet();
    	   /*t.add("A");
    	   t.add("a");
    	   t.add("Z");
    	   t.add("L");
    	   t.add("B");
    	   //t.add(new Integer(10));
    	  // t.add(null);exception NullPointerException
    	   System.out.println(t);
    	   */
    	   t.add(new StringBuffer("A"));
    	   t.add(new StringBuffer("Z"));
    	   t.add(new StringBuffer("L"));
    	   t.add(new StringBuffer("B"));
    	   System.out.println(t);
    	   System.out.printnl("B".compareTo("A"));
       }
}
