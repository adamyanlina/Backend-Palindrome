package picsart;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(994)); // false
        System.out.println(isPalindromeNumber(454)); // true
        System.out.println(isPalindromeText("Lina"));   // false
        System.out.println(isPalindromeText("Anna"));   // true
    }

    public static boolean isPalindromeNumber (int x) {
        int y = x;
        int s = 0;

        while (x != 0) {
            s = s * 10 + x % 10;
            x = x / 10;
        }
        return s == y ? true: false;
    }
    
    public static boolean isPalindromeText(String text) {
        for (int i = 0; i < Math.floor(text.length() / 2); i++) {
            if (Character.toLowerCase(text.charAt(i)) !=
                Character.toLowerCase(text.charAt(text.length() - 1 - i))
            ) {
                return false;
            }
        }
        return true;
    }

}
