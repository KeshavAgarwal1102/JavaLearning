package Collection;
import java.util.Stack;
public class StackLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		s.push("Keshav");
		s.push("Manish");
		s.push("Ashu");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("Manish"));//will return offset (from top to bottom 1 to n
		System.out.println(s.search("Shyam"));
	    s.pop();
	    System.out.println(s);
	    System.out.println(s.empty());
		

	}

}
