import java.util.Scanner;

public class Factorial {


    public static int fact(int n){
        if(n==0){
            return 1;
        }
        else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(fact(n));
//        int fact=1 +;
//        for(int i=0; i<=n; i++){
//            fact=fact*i;
//            System.out.println(fact);
//        }
    }
}


