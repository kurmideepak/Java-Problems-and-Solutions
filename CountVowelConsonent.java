public class CountVowelConsonent {
    public static void main(String[] args) {
        String input = "Dipakurmi";
        String str = input.toLowerCase();
        int vowel = 0;
        int consonent = 0;
        for (int i= 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                } else {
                    consonent++;
                }
            }
        }
        System.out.println("Vowel: " + vowel);
        System.out.println("Consonent: " + consonent);
    }
}
