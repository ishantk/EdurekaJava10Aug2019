package co.edureka.threads;

class Printer{
	
	// void print(String docName, int copies) {
	// synchronized method : will acquire a lock on its execution and will release when the method is finished
	// synchronized void print(String docName, int copies) {
	
	void print(String docName, int copies) {
		for(int i=1;i<=copies;i++) {
			System.out.println(">> Prinitng "+docName+" Copy# "+i);
		}
	}
}

class Desktop extends Thread{
	
	Printer pRef;
	
	Desktop(Printer p){
		pRef = p;
	}
	
	public void run() {
		// synchronized block with lock on Object pointed by pRef
		synchronized (pRef) {
			
			try {
				pRef.wait(); // which tells thread to stop its execution till time it is not notified
				//pRef.wait(1000); // Timed Waiting
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
			
			pRef.print("**John's Resume**", 10);
		}
	}
}


class Laptop extends Thread{
	
	Printer pRef;
	
	Laptop(Printer p){
		pRef = p;
	}
	
	public void run() {
		// synchronized block with lock on Object pointed by pRef
		synchronized (pRef) {
			pRef.print("^^LearningPython.pdf^^", 10);
			
			pRef.notify(); // notify waiting Thread on pRef
			//pRef.notifyAll(); // for multiple threads waiting on the same resource :)
		}
	}
}


public class SyncDemo {

	public static void main(String[] args) {
		
		// Use Case : We have only 1 Single Printer Object :) created below
		Printer printer = new Printer();
		//printer.print("John's Resume", 10);
		
		// Desktop and Laptop are using the same Printer Object :)
		
		Desktop dRef = new Desktop(printer);
		Laptop lRef = new Laptop(printer);
		
		
		// We have 2 threads which are starting together with main.
		// they will be executed parallel i.e. together i.e. asynchronously 
		dRef.start();
		lRef.start();
		
		// Challenge : When we have multiple threads accessing the same object, we cannot apply asynchronous technique !!
		//			   We must execute them synchronously :)

	}

}
