package basicPrograms;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacters {

	public static void main(String[] args) {	
		
		String givenString = "abcdabba";
		String[] stringArr = givenString.split("");
		Map<String, Integer> map = new HashMap<>();
		for(String s:stringArr) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			} else {
				map.put(s, 1);
			}
		}
		System.out.println(map);
	}

}