import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;  //32
            n=n/10;


        }
        System.out.println(rev);
        sc.close();

    }
}
