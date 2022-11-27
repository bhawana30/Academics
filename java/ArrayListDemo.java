import java.util.*;
class ArrayListDemo{
    public static void main(String args[]){
        ArrayList<String>al=new ArrayList<String>();
        System.out.println("size : "+al.size());//initial - 0
      //Methods -- add();
        al.add("B");
        al.add("Bhawana");
        al.add("1234");
       al.add(1,"456");
        System.out.println("size : "+al.size());
        //Print entire arraylist;
        System.out.println("Contents "+al);
        //remove();
        al.remove("Bhawana");
        // al.remove("Abcd");
        System.out.println(al.size());
        System.out.println(al);
        


    }
}