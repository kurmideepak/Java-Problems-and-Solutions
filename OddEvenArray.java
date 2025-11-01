import java.util.Scanner;

public class OddEvenArray {
    public static void OddEvenSequence(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                System.out.print("even");
            } else {
                System.out.print("odd");
            }
            if (i < arr.length-1){
                System.out.print(" ");
            }
        }
        /*if (arr[arr.length-1] % 2 == 0){
            System.out.print("even");
        } else {
            System.out.print("odd");
        }*/

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        OddEvenSequence(arr);
    }
}
