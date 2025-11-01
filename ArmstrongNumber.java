import java.util.Scanner;

public class ArmstrongNumber {
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int t1 = num;
        int length = 0;
        while (t1 != 0){
            t1 = t1/10;
            length++;
        }
        int t2 = num;
        int sum = 0;
        while (t2 != 0){
            int digit = t2 % 10;
            int power = 1;
            for (int i = 1; i <= length; i++){
                power = power * digit;

            }
            sum = sum + power;
            t2 = t2/10;
        }
        if (sum == num){
            System.out.println("The number is a armstrong number.");
        } else {
            System.out.println("The number is not a armstrong number.");
        }*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int length = String.valueOf(num).length();

        while (temp != 0){
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp = temp/10;
        }
        if (sum == num){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
