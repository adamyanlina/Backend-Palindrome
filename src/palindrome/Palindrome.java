package palindrome;

public class Palindrome {
    boolean isPalindromeNumber (int x) {
        int y = x;
        int s = 0;

        while (x != 0) {
            s = s * 10 + x % 10;
            x = x / 10;
        }
        return s == y ? true: false;
    }
    
    boolean isPalindromeText(String text) {
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
