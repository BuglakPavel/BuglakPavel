package threadPackage;

public class SecondThread extends Thread {

	@Override
	public void run() 
	{

		long num = 0;

		while (num < 3) {
			num++;
			System.out.println("0 - new SecondThread");

			try {
				sleep(1000); // Приостанавливает поток на 1 секунду
			} catch (InterruptedException e) {
			}

			System.out.println("1 - new SecondThread");

			try {
				sleep(1000); // Приостанавливает поток на 1 секунду
			} catch (InterruptedException e) {
			}

			System.out.println("2 - new SecondThread");

			try {
				sleep(1000); // Приостанавливает поток на 1 секунду
			} catch (InterruptedException e) {
			}

			System.out.println("3 - new SecondThread");

			try {
				sleep(1000); // Приостанавливает поток на 1 секунду
			} catch (InterruptedException e) {
			}

			System.out.println("4 - new SecondThread");

			try {
				sleep(1000); // Приостанавливает поток на 1 секунду
			} catch (InterruptedException e) {
			}

		}

		System.out.println("Finish firstThread");
	}

}
