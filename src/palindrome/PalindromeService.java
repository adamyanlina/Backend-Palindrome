package palindrome;

public class PalindromeService {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        System.out.println(palindrome.isPalindromeNumber(994)); // false
        System.out.println(palindrome.isPalindromeNumber(454)); // true
        System.out.println(palindrome.isPalindromeText("Lina"));   // false
        System.out.println(palindrome.isPalindromeText("Anna"));   // true
    }
}
