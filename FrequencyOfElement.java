import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 2, 34, 4, 55, 2, 6, 7, 7};
        boolean[] visited = new boolean[arr.length];
        System.out.println("Frequency of elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times.");
        }
    }
}
