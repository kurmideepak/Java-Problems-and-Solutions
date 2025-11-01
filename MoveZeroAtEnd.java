import java.util.Scanner;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        System.out.println("The result is: ");
        for (int k = 0; k < size; k++) {
            System.out.print(arr[k]);
            if (k < size-1) {
                System.out.print(" ");
            }
        }
    }
}

