import java.util.HashSet; // dynamic sliding window

public class LongestSubstringHashSet {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If character already in set, shrink window from left
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character to window
            set.add(c);

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest length = " + lengthOfLongestSubstring(str));
    }
}
