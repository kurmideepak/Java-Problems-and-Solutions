import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();
        int count = 0;
        int idx = str.length() -1 ;
        while (str.charAt(idx) == ' '){
            idx--;
        }
        while (idx >= 0 && str.charAt(idx) != ' '){
            count++;
            idx--;
        }
        System.out.println("The length of last word in sentence is: " + count);
    }
}
