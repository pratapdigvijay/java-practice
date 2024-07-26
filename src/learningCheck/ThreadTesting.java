package learningCheck;

public class ThreadTesting {

	public static void main(String[] args) {
		Test test = new Test();
		test.start();

		// this will not invoke the the creating of new thread and will be running on
		// same existing thread
//		 test.run();
		
		for (int i = 0; i <args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}

class Test extends Thread {
	@Override
	public void run() {
		System.out.println("Running Test class thread");
		call();
		ThreadTesting.main(new String[]{"abc"});
	}

	private void call() {
		System.out.println("calling method call");

	}

}