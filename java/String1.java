class String1{
    public static void main(String args[]){
        String s1=new String("BHAWANA");
        String s2=new String(s1);
        s1="bhawana";
     //   s2="bhawana";
        System.out.println(s1);
        System.out.println(s1.length());
        char chars[]={'a','b','c','d','e'};
        String str=new String(chars,1,2);
        System.out.println(str);


       /*  byte ascii[]={65,66,67,68,69,70};
        String s3=new String(ascii);
        System.out.println(ascii);
        String s4=new String(ascii,2,4);
        System.out.println(s4);*/   //doubt;

        //charAt();
        System.out.println(s1.charAt(2));
        
        //concatenation 
        String s5="four"+2+2;   //422
        String s6="four"+(2+2); //44
        System.out.println(s5);
        System.out.println(s6);
        
        //equals()
        System.out.println(s1.equals(s2));//s1="bhawana" s2="BHAWANA"
        System.out.println(s1.equalsIgnoreCase(s2));//s1="bhawana" s2="BHAWANA"
        s1="bhawana";
        s2="cdbhawkl";
        System.out.println(s1.regionMatches(0,s2,2,4));//s1="bhawana" s2="BHAWANA"
        s1="cdbhawklbhaw";
        System.out.println(s1.startsWith(s2));
        //Comaprison
        String s7="c";
        String s8="aaa";
        System.out.println(s7.compareTo(s8));//less than 0 means s7 is less than s8;
        // = 0 means equal
        //>0 means s7 greater than s8;
        //compares as in alphabetical order i.e. c>aaa

        //equals vs == 
        String st1="bhawana";
        String st2=new String(st1);
        System.out.println(st1.equals(st2));
        System.out.println(st1==st2);
        /*
         equals compares two strings means compares charchters of both the strings
         whereas == compares whether both the strings are referring to the same instance 
         or not.
         like String s1="bhawana"
         String s2="bhawana";
         String s3=new String("bhawana");
         s1==s2 true
         s1==s3 false   //bcz new object is created here.
         */

         //Searching
         String st3="bhawana";
         System.out.println(st3.indexOf('a'));//returns the index of first char
         //same as st3.lastIndexOf(char);

         //String Modification
         String st4=st3.substring(2);
         String st5=st3.substring(2,5);
         System.out.println(st5);

         String st6="     abcd     ";
         System.out.println(st6);
         st6=st6.trim();
         System.out.println(st6);
    }
}