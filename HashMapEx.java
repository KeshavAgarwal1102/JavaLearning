import java.util.*;
class HashMapEx{
  public static void main(String[] args){
     HashMap<String,Integer> m= new HashMap<>();
m.put("Keshav",100);
m.put("Shyam",200);
m.put("Manish",300);
m.put("Ashutosh",400);
System.out.println(m);
System.out.println(m.put("Shyam",500));
Set<String> s=m.keySet();
System.out.println(s);
Collection<Integer> c= m.values();
System.out.println(c);
Set s1= m.entrySet();
System.out.println(s1);
Iterator itr=s1.iterator();
while(itr.hasNext()){
Map.Entry m1=(Map.Entry)itr.next();
System.out.println(m1.getKey()+".."+m1.getValue());
if(m1.getKey().equals("Ashutosh")){
m1.setValue("1000");
System.out.println(m);
}
}
}
}
