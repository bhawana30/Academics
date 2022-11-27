class A {
static int i;
static void show()
{
    System.out.println("kinni");
}
}
// Create a subclass by extending class A.
class B extends A {
static int i; // this i hides the i in A
B(int a, int b) {
super.i = a; // i in A
i = b; // i in B
}
static void show() {
// System.out.println("i in superclass: " + super.i);
System.out.println("i in subclass: " + i);
}
}
 
class UseSuper {
public static void main(String args[]) {
B subOb = new B(1, 2);
show();
super.show();
}
}
