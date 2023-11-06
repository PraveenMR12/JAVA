import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int n1=0;
        int n2 =1;
        System.out.println(n1 +"\n"+n2);
        for(int i=2; i<n; i++){
            int next=n1+n2;
            n1=n2;
            n2=next;
//            next=n1+n2;
            System.out.println(next);

        }
        sc.close();
    }
}
