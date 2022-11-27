class myExc extends Exception{
    myExc(String str){
          super(str);
    }
    public static void main(String args[]){
        
        int b=-4,c=1,a=4;
        try{
        int d=(int)Math.sqrt(b*b-4*a*c);
        System.out.println(d);
        if(d<=0){
            throw new myExc("System.out.println(x)");
          }
        }
          catch(myExc e)
          {
            System.out.println(e);
          }
          System.out.println("End");
    }
}