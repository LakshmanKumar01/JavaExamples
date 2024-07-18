package String;

public class Reverse_String {
	public static void main(String[] args) {
		String name = "Lakshman Kumar";
		char[] reverse = name.toCharArray();
		int start = 0;
		int end = reverse.length - 1;
		while (start <= end) {
			char temp = reverse[start];
			reverse[start] = reverse[end];
			reverse[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]);
		}
	}
}
