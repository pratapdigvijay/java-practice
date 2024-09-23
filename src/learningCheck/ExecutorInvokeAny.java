package learningCheck;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorInvokeAny  {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newFixedThreadPool(2);

		Callable<Object> task1 = () -> {
			throw new NullPointerException("task1");
		};

		Callable<Object> task2 = () -> {
			throw new ArithmeticException("task2");
		};
//		Object invokeAny = service.invokeAny(List.of(task1, task2));
//	System.out.println(invokeAny);
		
		List<Future<Object>> invokeAll = service.invokeAll(List.of(task1, task2));
		for (Future<Object> future : invokeAll) {
			Object object = future.get();
			System.out.println(object);
		}
		service.shutdown();
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		Runnable task = () -> {
		    // Task logic here
		    System.out.println("Task executed by: " + Thread.currentThread().getName());
		};

		executorService.submit(task);

		// Shutdown the executor service
		executorService.shutdown();

	}
}
