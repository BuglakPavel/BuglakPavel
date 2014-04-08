package threadPackage;

public class ShutdownHook extends Thread {
	public void run() {
		System.out.println ("Shutting down");
	}
}
