import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int num,num2;
        Scanner s = new Scanner(System.in);
        num=s.nextInt();
        num2=num;
        int reverse=0;
        while(num!=0){
            int num1=num%10;
            reverse=reverse*10+num1;
            num=num/10;
        }
        System.out.println(reverse==num2?"Palindrome":"Not a palindrome");
    }
}
