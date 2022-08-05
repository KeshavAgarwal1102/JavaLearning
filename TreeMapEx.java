package Collection;
import java.util.TreeMap;
public class TreeMapEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        TreeMap tm= new TreeMap();
	        tm.put(100,"Keshav");
	        tm.put(101,"Aditya");
	        tm.put(102,"Yash");
	        tm.put(103,"Manish");
	        tm.put(99,"Ashutosh");
	       // tm.put("Shyam","Shyam");
	      //  tm.put(null, "Rahul");
	        tm.put(99,100);
	        System.out.println(tm);
	        
	        
	     /* TreeMap<Integer,String> tm= new TreeMap<>();
	        tm.put(100,"Keshav");
	        tm.put(101,"Aditya");
	        tm.put(102,"Yash");
	        tm.put(103,"Manish");
	        tm.put(99,"Ashutosh");
	     //   tm.put(99,100);the method put(Integer, String) in the type TreeMap<Integer,String> is not applicable for the arguments (int, int)
	       // tm.put("Shyam","Shyam");
	      //  tm.put(null, "Rahul");
	        System.out.println(tm);
	         
	     */   
		}

	}


