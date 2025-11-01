import java.util.Scanner;

public class TimeKeeper {
    public static void timeCalculate(int[] clock){
        int total = 0;
        int higher = 0;
        for (int i = 0; i < clock.length; i++) {
            total = total + clock[i];
            if (higher < clock[i]) {
                higher = clock[i];
            }
        }
        System.out.println(total);
        System.out.println(higher);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] clock = new int[size];
        for (int i = 0; i < size; i++) {
            clock[i] = sc.nextInt();
        }
        timeCalculate(clock);
    }
}
