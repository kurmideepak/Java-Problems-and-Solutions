import java.util.Scanner;

public class MinSwitchPress {
    public static int minSwitchPresses(int[] bulbs){
        int count = 0;
        int flips = 0;
        for (int bulb : bulbs){
            int currentState = (bulb + flips) % 2;
            if (currentState == 0){
                count++;
                flips++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(minSwitchPresses(arr));
    }
}
