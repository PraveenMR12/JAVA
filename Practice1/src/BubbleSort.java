import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 12,3, 20, 2, 1, 6, 4, 9};
		int temp;
		for(int i =0; i<arr.length; i++) {
			boolean sorted = true;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					sorted = false;
				}
			}
			if(sorted)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}

}
