import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
