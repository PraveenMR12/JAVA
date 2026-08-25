import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int[] arr = {5, 12,3, 20, 2, 1, 6, 4, 9};
	for(int i =0; i<arr.length; i++) {
		int min = arr[i];
		int index =i;
		for(int j=i+1; j<arr.length; j++) {
			if(min>arr[j]) {
				min=arr[j];
				index=j;
			}
			
		}
		arr[index]=arr[i];
		arr[i]=min;
	}
	System.out.println(Arrays.toString(arr));
}
}
