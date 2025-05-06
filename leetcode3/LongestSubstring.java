package leetcode3;

import java.util.HashSet;

public class  LongestSubstring {
    public static int lenghtOfLongestSubstring(String s){
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int rigth = 0; rigth < n; rigth++){
            while (set.contains(s.charAt(rigth))) {
                set.remove(s.charAt(left));
                left++;
                
            }
            set.add(s.charAt(rigth));
            maxLength = Math.max(maxLength, rigth - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lenghtOfLongestSubstring("abcabcbb"));
        System.out.println(lenghtOfLongestSubstring("bbbbbbb"));
        System.out.println(lenghtOfLongestSubstring("pwwkew"));
    }
}
