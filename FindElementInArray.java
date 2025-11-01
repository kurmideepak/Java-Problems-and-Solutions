import java.util.*;
public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the element: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        while (start < end){
            int mid = (start + end)/2;
            if (arr[mid] == target){
                System.out.println("Element found at index " + mid);
                found = true;
                break;
            } else if(target<arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (!found){
            System.out.println("Element is not found in the array.");
        }
    }
}
