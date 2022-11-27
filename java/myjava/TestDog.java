class Animal {
    Animal(){
        System.out.println("Inside Animal's Constructor");
    }
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
    Dog(){
        System.out.println("Inside Dog's constructor");
    }
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
   
      Animal a = new Animal(); // Animal reference and object
      Animal b = new Dog(); // Animal reference but Dog object
      Dog d=new Dog();
     
    //   d.move();
     // a=d;
    //   a.move(); // runs the method in Animal class
    //   b.move(); // runs the method in Dog class
   }
}