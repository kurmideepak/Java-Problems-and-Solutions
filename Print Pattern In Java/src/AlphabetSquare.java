import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines in Alphabet square: ");
        int rows  = sc.nextInt();


        for(int i = 65; i <= 65+rows; i++){
            for (int j = 65; j <= 65+rows; j++){
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
}
