import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {

    // Function signature should not be modified
    public static int fountainIndex(int[] water, int[] cost) {
        int totalWater = 0;
        int currentWater = 0;
        int start = 0;
        int n = water.length;

        for (int i = 0; i < n; i++) {
            int balance = water[i] - cost[i];
            totalWater += balance;
            currentWater += balance;

            // If at any point currentWater becomes negative,
            // current start point is invalid; move to the next
            if (currentWater < 0) {
                start = i + 1;
                currentWater = 0;
            }
        }

        // If total water is less than total cost, no valid start point
        if (totalWater < 0) return -1;
        return start % n;
    }

    // Optional main method for testing locally
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] water = new int[n];
        int[] cost = new int[n];

        for (int i = 0; i < n; i++) {
            water[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        System.out.println(fountainIndex(water, cost));
        sc.close();
    }
}
