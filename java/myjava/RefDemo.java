class Box {
    private int z=10;
   double width;
   double height;
   double depth;
   Box(Box ob) { // pass object to constructor
   width = ob.width;
   height = ob.height;
   depth = ob.depth;
   }
   Box(double w, double h, double d) {
   width = w;
   height = h;
   depth = d;
   }
   Box() {
   width = -1; // use -1 to indicate
   height = -1; // an uninitialized
   depth = -1; // box
   } 
  Box(double len) {
   width = height = depth = len;
   }
   double volume() {
   return width * height * depth;
   }
  }
  class BoxWeight extends Box {
   double weight; // weight of box
   // constructor for BoxWeight
   BoxWeight(double w, double h, double d, double m) 
  {
   width = w;
   height = h;
   depth = d;
   weight = m;
   } 
   void show()
   {
    System.out.println("abd");
   }
  }
  
class RefDemo {
public static void main(String args[]) {
BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
Box plainbox = new Box();
double vol;
vol = weightbox.volume();
System.out.println("Volume of weightbox is " + vol);
System.out.println("Weight of weightbox is " + weightbox.weight);
System.out.println();
// assign BoxWeight reference to Box reference

plainbox = weightbox;
vol = plainbox.volume(); // OK, volume() defined in Box
System.out.println("Volume of plainbox is " + vol);
plainbox.show();
//System.out.println("Weight of plainbox is " + plainbox.weight);
/* The following statement is invalid because plainbox
does not define a weight member. */

}
}
