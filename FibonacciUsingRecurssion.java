import java.util.Scanner;
import java.utils.*;
public class FibonacciUsingRecurssion {
   static int n1=0,n2=1,n3,count;
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        count=s.nextInt();
        System.out.print(n1+" "+n2);
        printfib(count-2);

    }
    public static void printfib(int a)
    {
        if(a>0){
            n3=n1+n2;
            n2=n3;
            n1=n2;
            System.out.print(" "+n3);
            printfib(a-1);
        }
    }
}
