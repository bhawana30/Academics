//Simple Hello World program
class d1{
    public static void main(String args[]){
        System.out.println("Hello Bhawana");
        


// java code -> compiler -> Bytecode -> interpreter(JVM) -> output 

//Features of Java
/*
1. Simple --- easy to learn, understand , simple syntax, 
removed many complicated concepts like pointers,etc.

2. Object Oriented --- Everything in java is an object. 
And evry object possess data and behaviour both.
java supports all concepts of oops---class, object, inheritance,
polymorphism, abstraction, encapsulation.
But java is not a pure object oriented prog. lang. because 
it allows usage of primitive data types which are not objects.
Small talk is a purely obj. ori. prog. lang.

3.Platform Independent --- Because of ByteCode.
The Output of Java Compiler is ByteCode

Java Compiler compiles it's program and generates bytecode and that
bytecode can be executed on any platform.That makes java Platform
independent.
Java supports basic principle "Write Once, Run anywhere".

4.Secured --- No Explicit pointer
Java programs run inside it's own run time environment which makes
more secure.
Security Manager of Java ensures which resources a class can access.
These securities are provided by java by default.

5. Robust --- Uses strong memory Management.
No pointers that reduces security problem.
Automatic garbage collection.
Exception handling and type checking makes it more robust.

5. Portable --- Because bytecode is portable. it can run on any
system.

6. High Performance --- It's faster than other interpreted languages
but slower than languages like c, c++.
Because java programs are compiled and interpreted both.

7. Distributed ---

8. Multithreaded --- Java Supports Multithreading. Multiple tasks can
be done concurrently and main adv is they don't occupy separete memory 
for every thread.

9. Dynamic --- 


 */

 /* Datatypes--
  8 primitive data types--
  (byte , short, int , long) -> Integers
  (float, double)-> floating point numbers
  (char) -> Charachters 
    (boolean) ->Boolean
  */
        char ch1='B';
        char ch2=88;
        System.out.println(ch1+ " "+ ch2+" ");//B X
        ch1++;
        System.out.println(ch1);//C
    

        //Dynamic Initialization of variables;
        int a=1,b=2;
        int c=a*(b+a);//Dynamic
        System.out.println(c);//1*(1+2)=3

/*Scope and lifetime of variables ---
vars are accesses within the block in which they are initialized.
 */
    for(int i=1;i<=2;i++)
    {
        int h=3;
        System.out.println(i+" ");    
    }
    // System.out.println(h);//h is undefined;

//Type Conversion and Casting
/*
Automatic Conversion for compatible types
If the types are not compatible like int x=double d
int is smaller than double, not compatible 
So explicit conversion is required
double d;
int x=(int)d;
 */
    // double d=3;
    // int x=(int)d;
    // System.out.println("x : "+x);//3
 //   x=d;//Type mismatch

 byte bt;
 int i = 136;
 double d = 323.142;
 
 System.out.println("\nConversion of int to byte.");
 bt = (byte) i;

 byte btt = (byte) 0xf1;
 System.out.println("ctt "+btt);
 byte ctt = (byte) (b >> 1);
 System.out.println("ctt "+ctt);
 //1 byte=8bits;
 //i=128 === 10000000 ===msb is 1 so convert in 2's complement
 //bt=-128
 //if i=257==== 1   00000001 
 //bt=1 bcz last 8 bits 00000001 ===1
 //i=1  10000000 === 384 
 //last 8 bits === 10000000 ===128 but 2's complewment
 System.out.println("i and bt " + i + " " + bt);

 System.out.println("\nConversion of double to int.");
 i = (int) d;
 System.out.println("d and i " + d + " " + i);

 System.out.println("\nConversion of double to byte.");
 b = (byte) d;
 System.out.println("d and bt " + d + " " + bt);

/*byte x=40;
byte y=50;
byte z=100;
int g=x*y/z;
type of x*y ???????-->int
*/

/*Array---
1-d array
int arr[];/////arr is array variable set to null;
memory allocation using new
arr=new int[size];
int a1[]=new int[3];
int a1[]=new int[3];
by default all elements initialized to 0;

2-d array
int arr[][]=new int[4][5];
int [][]arr=new int[4][5];

create multiple arrays---
int []nums,nums1,nums2;
//3 arrays ;
 */

    }
}
