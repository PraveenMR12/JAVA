//class ArrayCustomException extends Exception{
//	public String toString() {
//		return "Array index out of bounds";
//	}
//	public String getMessage() {
//		return "Array index out of bounds1";
//	}
//}
public class ExceptionDemo {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int index=6;
		try {
			int res = fetchElement(arr, index);
			System.out.println(res);
		}catch(Exception e){
			System.out.println(e);
		}
//		int res = fetchElement(arr, index);
//		System.out.println(res);
		
	

	}

	static int fetchElement(int[] arr, int n) throws Exception{
//		if(n>=arr.length-1) {
//			throw new ArrayCustomException();
//		}
		int ele=arr[n];
		return ele;
	}

}
