package Collection;
import java.util.*;
//public class StackLearn {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Stack s= new Stack();
//		s.push("Keshav");
//		s.push("Manish");
//		s.push("Ashu");
//		System.out.println(s);
//		System.out.println(s.peek());
//		System.out.println(s);
//		System.out.println(s.search("Manish"));//will return offset (from top to bottom 1 to n
//		System.out.println(s.search("Shyam"));
//	    s.pop();
//	    System.out.println(s);
//	    System.out.println(s.empty());
	       public class IteratorDemo {
	    	public static void main(String[] args) {
	    	ArrayList l = new ArrayList();
	    	for (int i=0; i<=10; i++) {
	    	l.add(i);
	    	}
	    	System.out.println(l);
	    	Iterator itr = l.iterator();
	    	while(itr.hasNext()) {
	    	Integer I = (Integer)itr.next();
	    	if(I%2 == 0)
	    	System.out.println(I);
	    	else
	    	itr.remove();
	    	}
	    	System.out.println(l);
	    	}
		

	}

//}
