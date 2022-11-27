import java.util.*;
class IteratorDemo {
public static void main(String args[]) {
ArrayList<String> al = new ArrayList<String>();
al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
System.out.print("Original contents of al: ");
Iterator<String> itr = al.iterator();
//Initially itr 0th element se phle point krega...hasNext check krega ki kya next index pr element h ya nhi h
//yh true ya false return krega...agr hai to next method se next element pr jaenge aur print krenge 


// ArrayList<String>al2=new ArrayList<String>();
// Iterator<String>itr2=al2.iterator();
// System.out.println(itr2.next());
while(itr.hasNext()) {
String element = itr.next();
System.out.print(element + " ");
}
System.out.println();
ListIterator<String> litr = al.listIterator();
while(litr.hasNext()) {
String element = litr.next();
litr.set(element + "+");
}
System.out.print("Modified contents of al: ");
itr = al.iterator();
while(itr.hasNext()) {
String element = itr.next();
System.out.print(element + " ");
}
System.out.println();
System.out.print("Modified list backwards: ");
while(litr.hasPrevious()) {
String element = litr.previous();
System.out.print(element + " ");
}
System.out.println();
}
}
