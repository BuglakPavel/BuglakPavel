package threadPackage;


public class FirstThread implements Runnable {


     public void run() {
    	 
           long num = 0;
          
           while(num < 3) {
        	   
        	   num++;
        	   System.out.println("0 - new FirstThread");
        	   
        	   try{
                   Thread.sleep(500);		
               }catch(InterruptedException e){}
        	   
        	   System.out.println("1 - new FirstThread");
        	   
        	   try{
                   Thread.sleep(500);		
               }catch(InterruptedException e){}
        	   
        	   System.out.println("2 - new FirstThread");
        	   
        	   try{
                   Thread.sleep(500);		
               }catch(InterruptedException e){}
        	   
        	   System.out.println("3 - new FirstThread");
        	   
        	   try{
                   Thread.sleep(500);		
               }catch(InterruptedException e){}
        	   
        	   System.out.println("4 - new FirstThread");
        	   
        	   try{
                   Thread.sleep(500);		
               }catch(InterruptedException e){}
        	 
           }
           System.out.println("Finish firstThread");
              
     }
	
}
