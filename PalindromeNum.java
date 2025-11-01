public class PalindromeNum {
    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;
        while (temp != 0){
            int digit = temp%10;
            rev = rev * 10 +digit;
            temp = temp/10;
        }
        if (rev == num){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        String str = "dipak";
        int len = str.length()-1;
        String reverse = "";
        for (int i = len-1; i >= 0; i++){
            reverse = reverse + str.charAt(i);
        }
    }
}
