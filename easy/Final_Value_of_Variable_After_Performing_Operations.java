package easy;

public class Final_Value_of_Variable_After_Performing_Operations {
	public int finalValueAfterOperations(String[] operations) {
		int num = 0;
		for (int i = 0; i < operations.length; i++) {
			String temp = operations[i];
			if (temp.equals("++X") || temp.equals("X++")) {
				num++;
			} else {
				num--;
			}
		}
		return num;
	}
}
