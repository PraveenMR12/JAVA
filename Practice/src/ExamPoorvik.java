import java.util.*;
import java.util.stream.Collectors;
public class ExamPoorvik {
	    public static void main(String[] args) {
	    	int[] arr = {1,2,9,6,5,6,7,8};
	    	List<Integer> l1 =new ArrayList<Integer>();
	    	l1.add(11);
	    	l1.add(12);
	    	l1.add(13);
	    	l1.add(14);
	    	l1.add(16);
	    	l1.add(15);
//	    	System.out.println(Arrays.toString(arr));
//	    	Arrays.sort(arr);
//	    	System.out.println(Arrays.toString(arr));
	    	
	    	
	    	//methods to convert int array into list of Integer
	    	List<Integer> l2=Arrays.stream(arr).boxed().toList();
	    	List<Integer> l3=Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
	    	List<Integer> l4=Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.toList()); //not working
	    	List<Integer> l5=Arrays.stream(arr).boxed().collect(Collectors.toList());
	    	
	    	
	    	//methods to convert int array into list of Integer
	    	int[] brr =l1.stream().mapToInt(Integer::intValue).toArray();

	    	System.out.println(Arrays.toString(brr));
	    	
	    }
}