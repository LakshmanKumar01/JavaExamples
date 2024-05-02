// BubbleSort Program

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {6,8,2,0};
		int n = a.length;
		System.out.println("Before Sort");
		printarray(a);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("After Sort");
		printarray(a);
	}
	static void printarray(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] +" ");
		}
	}
}
