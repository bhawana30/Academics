// class Test {
//     int a;
//     Test(int i) {
//     a = i;
//     }
//     Test incrByTen() {
//     Test temp = new Test(a+10);
//     return temp;
//     }
//    }
//    class d3 {
//     public static void main(String args[]) {
//     Test ob1 = new Test(2);
//     Test ob2;
//     ob2 = ob1.incrByTen();
//     System.out.println("ob1.a: " + ob1.a);
//     System.out.println("ob2.a: " + ob2.a);
//     ob2 = ob2.incrByTen();
//     System.out.println("ob2.a after second increase: "+ ob2.a);
//     }
//    }
class d3 { 
    static void vaTest(int... v) { 
    System.out.print("Number of args: " + v.length +" Contents: "); 
    for(int x : v) 
    System.out.print(x + " "); 
    System.out.println(); 
    }
    public static void main(String args[]){ 
    // array created to hold the arguments. 
    int n1[] = { 10 }; 
    int n2[] = { 1, 2, 3 }; 
    int n3[] = { }; 
    vaTest(n1); // 1 arg 
    vaTest(n2); // 3 args 
    vaTest(n3); // no args 
    } 
    }
     