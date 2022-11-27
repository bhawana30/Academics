class MyThread{
    public void run()
    {
        System.out.println("Current thread name: "
                           + Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}
  
class GeeksforGeeks {
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        //t.run();//no multithreading takes place.
        // System.out.println(t);
        // t.setName("bhawana");
      
      
        t.start();
    }
}
/*
 Difference between start and run method
 start()   
 start()->creates a thread->internally calls run()
 1. it creates a new thread and then calls run method on the newly created thread.
 2. it can not be invoked multiple times otherwise it will throw exception
 java.lang.IllegalStateException.

 run()
 run()->executes run();
 1. you can directly call run method but in that case no new thread 
 will be created and hence no multithreading will take place.
 2. can be called multiple times.
 3. defined in runnable interface and must be overridden in implementing 
 class.
 
 */