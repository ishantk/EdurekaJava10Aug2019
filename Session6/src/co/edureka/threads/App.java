package co.edureka.threads;


/*class MyTask{
	void print() {
		for(int i=1;i<=10;i++) {
			System.out.println(">> Printing ^^LearningPython.pdf^^ Page# "+i);
		}
	}
}*/

// Thread is a built in class
// Hence, MyTask is a Thread :)
class MyTask extends Thread{
	// What Child thread should do, must be written in the run method :)
	public void run() { // is part of Thread parent which we are re-defining in the Child :)
		
		System.out.println(">> MyTask State in run method is: "+getState());
		
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(1000); // 1000 milli secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> Printing ^^LearningPython.pdf^^ Page# "+i);
		}
		
		System.out.println("== MyTask Finished ==");
	}
}


class CA{
	
}

//class YourTask extends CA, Thread{ // error
// We can use Runnable interface as well to create a Child thread
class YourTask extends CA implements Runnable{
	
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1200); // 1200 milli secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing @@LearningGo.pdf@@ Page# "+i);
		}
	}
}

public class App {

	// Whatever we write in main is basically the job to be performed by main thread
	// main thread will execute all the instructions which we write in the main method !!
	
	// Challenge for the main thread:
	// In case any job in main thread will take more time, it will block the other jobs below !! :)
	// We may have a long running operation in the main. This is majorly due to internet connectivity concerns !!
	// OS will give an error message to the User, would you like to wait or kill the application !!
	
	public static void main(String[] args) {
	
		System.out.println(">> App Started");
		
		//MyTask mRef = new MyTask();
		//mRef.print();
		
		MyTask mRef = new MyTask();
		System.out.println(">> MyTask State after object construction is: "+mRef.getState());
		
		Runnable r = new YourTask(); // Polymorphic Statement | Ref Var of Interface points to the object which implements it
		Thread yRef = new Thread(r); // Pass Runnable Reference to the Constructor of Thread 
		
		// Change names of your threads
		mRef.setName("John");
		yRef.setName("Jennie");
		Thread.currentThread().setName("Fionna");
		
		// Setting of Priority is a request to JVM for low memory conditions or when JVM is occupied !!
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		yRef.setPriority(Thread.MIN_PRIORITY); // 1
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		
		mRef.start(); // start shall internally execute the run method. We do not execute run method directly !!
		System.out.println(">> MyTask State after start method is: "+mRef.getState());
		// Immediately after starting a thread, execute join method :)
		try { 
			mRef.join(); // Let all of my tasks get finished and let other threads wait :)
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		yRef.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500); // 500 milli secs
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing **LearningJava.pdf** Page# "+i);
		}
		
		System.out.println("<-> MyTask Thread Name: "+mRef.getName()+" and Priority: "+mRef.getPriority());
		System.out.println("<-> YourTask Thread Name: "+yRef.getName()+" and Priority: "+yRef.getPriority());
		System.out.println("<-> Main Thread Name: "+Thread.currentThread().getName()+" and Priority: "+Thread.currentThread().getPriority());
		
		System.out.println(">> MyTask State lastly is: "+mRef.getState());
		
		System.out.println(">> App Finished");

	}

}
