import java.util.Scanner;

public class PruntASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 65; i<=90; i++){
            System.out.println(i+" "+(char)i);
        }
        System.out.println("============");
        for(int i = 97; i<=122; i++){
            System.out.println(i+" "+(char)i);
        }
    }
}
