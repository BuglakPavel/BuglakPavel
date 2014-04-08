package threadPackage;

public class MainClass {
	
	static FirstThread mThing;
	
	static SecondThread mSecondThread;
    
	
    public static void main(String[] args) throws InterruptedException
    {
    	  	
    	mThing = new FirstThread();	
        System.out.println("FirstThread create");
    	 
    	Thread firstThready = new Thread(mThing);	
    	System.out.println("FirstThread start");
    	firstThready.start();	
       
        
        mSecondThread = new SecondThread();	
        System.out.println("SecondThread create");
        
        Thread secondThready = new Thread(mSecondThread);	
        System.out.println("SecondThready start");
        secondThready.start();				
        
        
        System.out.println("Main thready finish");

        Demo demo = new Demo();
		demo.start();
		
		try {
		System.in.read();
			} catch (Exception e) {
		;
		}
    }
    
}
