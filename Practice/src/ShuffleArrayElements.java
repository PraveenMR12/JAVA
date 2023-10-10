import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] originalArray = new int[sc.nextInt()];
        
        for(int i=0; i<originalArray.length; i++) {
        	originalArray[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(usingList(originalArray)));
        System.out.println();
        
        sc.close();

	}

	static Integer[] usingList(int[] originalArray) {
		 List<Integer> list = new ArrayList<Integer>();
		 for (int i = 0; i < originalArray.length; i++) {
			list.add(originalArray[i]);
		}
        Collections.shuffle(list);
        Integer[] shuffledArray = list.toArray(new Integer[list.size()]);
		return shuffledArray;
	}
	 
	
	

}
