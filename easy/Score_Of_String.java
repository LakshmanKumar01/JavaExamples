package easy;

public class Score_Of_String {
	public static int scoreOfString(String s) {
		int answer = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			int indexA = i;
			int indexB = i + 1;
			char firstLetter = s.charAt(indexA);
			char secondLetter = s.charAt(indexB);
			int firstASCIIValue = firstLetter;
			int secondASCIIValue = secondLetter;
			int absoluteDiff = firstASCIIValue - secondASCIIValue;
			int temp = Math.abs(absoluteDiff);
			answer = answer + temp;
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(scoreOfString("hello"));
		System.out.println(scoreOfString("zaz"));
	}
}
