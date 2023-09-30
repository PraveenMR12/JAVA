
public class RemoveArrayDuplicate {

	public static void main(String[] args) {
		int[] arr= {2,1,4,2,4,2,5,8,7};
//		HashSet<Integer> arrset=new HashSet<Integer>();
//		for(int i=0;i<arr.length;i++) {
//			arrset.add(arr[i]);
//		}
//		Integer[] res = arrset.toArray(new Integer[arrset.size()]);
//		System.out.println(Arrays.toString(res));
	
		
		int count=arr.length;
		int[] arr2=arr;

		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				
				if(arr2[i]==arr2[j]&&arr2[i]!=0) {
					arr2[j]=0;
					count--;
				}
			}
		}
		System.out.println(count);
//		int[] arr1=new int[count+2];
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]!=arr[j]) {
//					arr1[i]=arr[i];
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr1));
//		harish(arr);
		
		
	}
	
//	public static void harish(int[] arr) {
//		Arrays.sort(arr);
//		int f=0;
//		int[] res=new int[arr.length];
//		for(int i=0;i<arr.length;i++ ) {
//			if(arr[i]!=arr[i+1]) {
//				res[i]=arr[f];
//				f++;
//				
//			}
//		}
//		for(int i:res) {
//			System.out.println(i);
//		}
//	}
}
