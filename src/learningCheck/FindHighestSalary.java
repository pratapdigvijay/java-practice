package learningCheck;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindHighestSalary {
	
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>(); 
		  
        map.put("Hero", 30000); 
        map.put("Chand", 80000); 
        map.put("kalam", 70000); 
        map.put("Heroine", 25000); 
        map.put("Kiran", 63000); 
        map.put("Ishan", 45000); 
        
        System.out.println(getNthHighestSalary(map));
        SimpleDateFormat  format= new SimpleDateFormat("yyyMMdd");
        
        System.out.println(format.format(new Date()));
        
	}
	
	public static Map.Entry<String, Integer> getNthHighestSalary(Map<String, Integer> map) {

		return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.toList().get(0);

	}
}
