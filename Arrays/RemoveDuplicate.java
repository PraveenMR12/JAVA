import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr= {2,1,4,2,4,2,5,8,7};
		System.out.println(Arrays.toString(arr));

		
		int count=arr.length;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]&& arr[i]!=0) {
					arr[j]=0;
					count--;
				}
			}
		}

		int[] brr = new int[count];
		int j=0;
		for(int i=0; i<arr.length; i++) {
				if(arr[i]!=0) {
					brr[j]=arr[i];
					j++;
				}
					
		}
			System.out.println(Arrays.toString(brr));
		
	}

}
