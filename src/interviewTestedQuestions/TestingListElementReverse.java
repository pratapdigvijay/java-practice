package interviewTestedQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingListElementReverse {
	
	public static void main(String[] args) {
		
		List<Integer> arrList = List.of(1,4,5,7,8);
		
		List<Integer> list = Arrays.asList(1,4,5,7,8);
		
	//	System.out.println(arrList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
//		for(Integer integer : list) {
//			arrList.remove(integer);      UNSUPPORTED EXCEPTION
//		}
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(4);
		list2.add(5);
		list2.add(7);
		list2.add(8);
		
//		for(Integer integer : list2) {
//			list2.remove(integer);      CONCURRNET MODIFICATION EXCEPTION
//		}
	//	list2.removeAll(list);
		
		list.stream().close();
		System.out.println(list2.size());
		
		
		for (int i = 0; i < list2.size(); i++) {
			list2.remove(i);
			
		}
		System.out.println(list2.size());
		
		System.out.println(list2.subList(0, list2.size()));
		
		list2.subList(0, list2.size()).clear();
		
		System.out.println(list2.size());
		
		
	}
}
