package leetcode9;

public class PalindromeNumber2 {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   // Output: true
        System.out.println(isPalindrome(-121));  // Output: false
        System.out.println(isPalindrome(10));    // Output: false
    }
}
