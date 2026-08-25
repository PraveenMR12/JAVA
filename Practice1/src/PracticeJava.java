
public class PracticeJava {

	public static void main(String[] args) {
		int k=-1;
		for(int i=0; i<7; i++) {
			if(i<4)
				k++;
			else
				k--;
			boolean l=true;
			for(int j=0; j<7; j++) {
				if(j>=3-k && j<=3+k && l) {
					System.out.print(" *");
					l=false;
				}
				else {
					System.out.print("  ");
					l=true;
				}
			}
			System.out.print("\n");
		}

	}

}
