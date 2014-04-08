package threadPackage;

public class Demo {
	public void start() {
		System.out.println ("Demo");
		ShutdownHook shutdownHook = new ShutdownHook();
		Runtime.getRuntime(). addShutdownHook(shutdownHook);
	}
}
