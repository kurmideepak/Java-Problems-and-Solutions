import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int t1 = num;
        int sum = 0;
        while (t1 != 0){
            int digit = t1 % 10;
            sum = sum + digit;
            t1 = t1 /10;
        }
        System.out.println("The sum of digit of number is: " + sum);
    }
}
