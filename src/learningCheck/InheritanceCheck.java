package learningCheck;
import static java.lang.System.*;
class Animal {
	
	int speedlimit=90;  
	
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
	
	int speedlimit=150; 
	
	void eat() {
		System.out.println("dog is eating...");
	}
}

class Cat extends Animal{
	int speedlimit= 10;
	
	void eat() {
		System.out.println("cat is eating..");
	}
}

public class InheritanceCheck extends Dog {
	
	public static void main(String args[]) {
		Animal animal ;
		animal= new InheritanceCheck();
		animal.eat();
		
		System.out.println(animal.speedlimit);
		
	//	System.out.println(1 + 2 ==+ 3 + + + 5 + ++6 + --7);
		int[] [] goats = new int[3][];
	//  goats[0]= {1,2};
		out.println("ABC");
		
		int a = 5;
		int b = --a;
		System.out.println("a: " + a + ", b: " + b);
		
		animal = new Cat();
		animal.eat();
		System.out.println(animal.speedlimit);
		
	}
}
