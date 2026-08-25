import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = {3,12,42,4,2,64,20};
		for(int i=0;i<arr.length-1; i++) {
			int j=i;
			int temp = arr[j+1];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
