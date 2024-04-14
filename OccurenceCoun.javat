//String Occurence Count
import java.util.Map;
import java.util.LinkedHashMap;
public class OccurenceCount {
	public static void main(String[] args) {
		String name = "TOMATO";
		char[] nameArray = name.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char tempChar : nameArray) {
			if(map.get(tempChar) == null) {
				map.put(tempChar, 1);
			}
			else {
				Integer count = map.get(tempChar);
				map.put(tempChar, count+1);
			}
		}
		System.out.println(map);
	}
}
