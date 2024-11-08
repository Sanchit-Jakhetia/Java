class DemonThread1 
{
    public static void main(String[] args) 
	{
        Thread dt = new Thread(new Runnable(){ 
	
            @Override
            public void run()
	  {
                try 
		{
                    while (true) 
		    {
                        System.out.println("Daemon thread running in background...");
                        Thread.sleep(1000); // Sleep for 1 second
                    }
                } catch (Exception e) {}
                    
            }
         					});

 // Setting the thread as a daemon thread
        dt.setDaemon(true);
        dt.start();
        
        // Main thread sleeps for 3 seconds and then terminates
        try {
            Thread.sleep(3000);
        } catch (Exception e) {}
           
       
        
        System.out.println("Main thread finished. Daemon thread will exit now.");
    }
}