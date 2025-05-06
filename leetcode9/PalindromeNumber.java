package leetcode9;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverseHalf = 0;
        while (x > reverseHalf) {
            reverseHalf = reverseHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reverseHalf || x == reverseHalf / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10)); // Output: false
    }
}
