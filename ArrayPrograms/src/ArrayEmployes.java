import java.util.*;

public class ArrayEmployes {
	 public static void main(String[] args) {
		List li = new LinkedList();
//		li.add(4);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(6);
		li.add(5);
		li.add(7);
		ListIterator it = li.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
