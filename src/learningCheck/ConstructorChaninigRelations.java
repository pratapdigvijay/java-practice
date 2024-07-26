package learningCheck;

import java.util.ArrayList;

class Parent {

	Parent(int n) {
		// System.out.println("Parent class " + n);
	}
}

class Child extends Parent {
	int n;

	Child(int n) {
		super(0);
		n = n;
		// System.out.println("Child class " + n);
	}

}

public class ConstructorChaninigRelations {
	public static void main(String[] args) throws InterruptedException {
		Child c = new Child(1);
		System.out.println(c.n);

		Child[] child = new Child[] {};
//		System.out.println(child);
//		System.out.println(child.toString());
//		System.out.println(Arrays.toString(child));
		Child[] child2 = new Child[2];
//		System.out.println(child2[0]);
//		System.out.println(child2.toString());
//		System.out.println(Arrays.toString(child2));

		Child[] child3 = new Child[] { new Child(1), new Child(2), new Child(3) };
//		System.out.println(child3);
//		System.out.println(child3.toString());
//		System.out.println(Arrays.toString(child3));

		Integer[] arr = new Integer[3];
	//	int[] num = { 1,  (Integer) null, 3 }; // num[1] is possible during declaration but will fail during run time

	//	System.out.println(arr[1]);
	//	System.out.println(num[2]);
		
		ArrayList list = new ArrayList(16);
		
		System.out.println(list.toString());
		System.out.println(list);
		
		Thread.sleep(10000);
		System.out.println("Hello Geeks");

	}
}
