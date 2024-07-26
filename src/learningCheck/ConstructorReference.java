package learningCheck;

import java.util.function.Function;

public class ConstructorReference {

	public static void main(String[] args) {

		Function<Runnable, Thread> threadGenerator = Thread::new;
		Runnable task1 = () -> System.out.println("Task 1 executed");

		Thread thread1 = threadGenerator.apply(task1);

		thread1.start();
		threadGenerator.apply(() -> System.out.println("Task 2 executed")).start();
	}

}
