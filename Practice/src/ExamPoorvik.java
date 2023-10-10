
public class ExamPoorvik {
	   public static String generateZigZagPattern(String s, int n) {
	        if (n <= 1 || s.length() <= 1) {
	            return s;
	        }

	        StringBuilder[] zigzag = new StringBuilder[n];
	        for (int i = 0; i < n; i++) {
	            zigzag[i] = new StringBuilder();
	        }

	        int index = 0;
	        int step = 1;

	        for (char c : s.toCharArray()) {
	            zigzag[index].append(c);
	            if (index == 0) {
	                step = 1;
	            } else if (index == n - 1) {
	                step = -1;
	            }
	            index += step;
	        }

	        StringBuilder password = new StringBuilder();
	        for (StringBuilder row : zigzag) {
	            password.append(row);
	        }

	        return password.toString();
	    }

	    public static void main(String[] args) {
	        String S = "AAODNNBDE";
	        int N = 4;
	        String password = generateZigZagPattern(S, N);
	        System.out.println("Password: " + password);
	    }
}