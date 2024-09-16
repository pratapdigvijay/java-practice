package interviewTestedQuestions;

import java.util.Collections;
import java.util.HashSet;

//Question by Goldman Sachs
public class UpdateHashSet extends Thread{

	public static void main(String[] args) throws InterruptedException {
		HashSet<Student> studentList = new HashSet<>();

		Student st1 = new Student("Nimit", 1);
		Student st2 = new Student("Rahul", 3);
		Student st3 = new Student("Nimit", 2);
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);

		System.out.println(studentList.size());

	//	st1.id = 3;
		System.out.println(studentList.size());
		
		Student st4 = new Student("Nimit", 1);
		studentList.add(st4);
		System.out.println(studentList.size());
		System.out.println(st4.equals(st1));
		
		UpdateHashSet thread1 = new UpdateHashSet();
		UpdateHashSet thread2 = new UpdateHashSet();
		UpdateHashSet thread3 = new UpdateHashSet();
		
//		for(int i = 0; i<20 ;i++) {
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		
//		thread1.join();
//		thread2.join();
//		thread3.join();
//		
//	}
//	
	}
	static int count =0;
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + count++ );
		
	}
	
	

}


final class Student {
    public final int id;
    public final String name;

    public Student(String name, int id) {
        this.name = name; 
        this.id = id;
    }

    public int hashCode(int id) {
        return this.id;
    }

    public String toString() {
        return "Student: " + this.name + "@" + Integer.toHexString(hashCode());
    }

    public boolean equals(Object o) {
        if (o instanceof Student) {
           Student s = (Student) o;
           return s.id == this.id && s.name.equals(this.name)? true : false;
        }
        return false;
    }
}

