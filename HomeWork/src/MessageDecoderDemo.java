import java.util.Scanner;

public class MessageDecoderDemo {

	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			char c =sc.next().charAt(0);
	        MessageDecoder decoder = new MessageDecoder();
	        int unicode = decoder.decodeCharacter(c);
	        System.out.println(unicode);
	        sc.close();
	}

}
