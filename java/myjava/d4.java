class MyException extends Exception {
    private int detail;
    MyException(int a) {
    detail = a;
    }
    // public String toString() {
    // return "MyException[" + detail + "]";
    // }
    }
    class d4 {
    static void compute(int a) throws MyException {
    System.out.println("Called compute(" + a + ")");
    if(a > 10)
    throw new MyException(a);
    System.out.println("Normal exit");
    }
    public static void main(String args[]) {
        MyException me=new MyException(56);
        System.out.println(me);
    try {
    compute(1);
    compute(20);
    } catch (MyException e) {
    System.out.println("Caught " + e);
    }
    }
}
    