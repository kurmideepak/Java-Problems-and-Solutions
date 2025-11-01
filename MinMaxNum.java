import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < size; i++){
            if (arr[i] < min){
                min = arr[i];
            } else if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
    }
}
