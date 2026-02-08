// will work but give TLE
class MinimumwindSubstring {
    // public static String minWindow(String s, String t) {
    //     if (s.length() < t.length())
    //         return "";
    //     int i = 0;
    //     int j = 0;
    //     String ans = "";
    //     int min = Integer.MAX_VALUE;

    //     while (j < s.length()) {

    //         // Expand window
    //         String window = s.substring(i, j + 1);

    //         // When window contains all chars
    //         while (containsAllChars(window, t)) {

    //             // Update minimum
    //             if (window.length() < min) {
    //                 min = window.length();
    //                 ans = window;
    //             }

    //             // Shrink window from left
    //             i++;
    //             if (i > j)
    //                 break;
    //             window = s.substring(i, j + 1);
    //         }

    //         j++; // expand right
    //     }
    //     return ans;
    // }

    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return new String();
        }
        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        char[] chs = s.toCharArray();
        while (end < chs.length) {
            if (map[chs[end++]]-- > 0) {
                count--;
            }
            while(count==0){
                if(end-start<minLen){
                    startIndex=start;
                    minLen=end-start;
                }
                if(map[chs[start++]]++==0){
                    count++;
                }
            }
        }
        return minLen==Integer.MAX_VALUE?new String():
        new String(chs,startIndex,minLen);
    }

    // public static  boolean containsAllChars(String s, String target) {
    //     int[] freq = new int[128];
    //     for (char c : s.toCharArray())
    //         freq[c]++;
    //     for (char c : target.toCharArray()) {
    //         if (--freq[c] < 0)
    //             return false;
    //     }
    //     return true;
    // }
    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s, t));
    }
}