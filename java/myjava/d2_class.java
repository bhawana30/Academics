//class provides template for an object
//object is an instance of a class
//object possess state and behaviour
//state of an object is defined by data members and behaviour of 
//object by methods
class d2{
    int y;
    void set()
    { //  y=x;
        System.out.println("abcd");
        System.out.println("y : "+y);
    }
}
class d2_class{
    public static void main(String args[]){
        //Object creation
        d2 b=new d2();
        b.set();
        //new_ref_var is pointing to b;
        // d2 new_ref_var=b;
        // new_ref_var.set();
    }
}