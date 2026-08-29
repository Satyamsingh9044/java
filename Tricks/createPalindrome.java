public class createPalindrome {

    public static void main(String[] args) {

        String s = "abab";

        int freq[] = new int[26];
        int count = 0;
        char mid = ' ';

        // 1. Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // 2. Find middle character and take half of each frequency
        for (int i = 0; i < 26; i++) {

            if (freq[i] % 2 == 1) {
                mid = (char) (i + 'a');
                count++;
            }

            freq[i] = freq[i] / 2;
        }

        // 3. More than one odd-frequency character
        if (count > 1) {
            System.out.println("Not Possible");
            return;
        }

        // 4. Create left half
        StringBuilder left = new StringBuilder();

        for (int i = 0; i < 26; i++) {

            while (freq[i] > 0) {
                left.append((char) (i + 'a'));
                freq[i]--;
            }
        }

        // 5. Create right half by reversing left
        StringBuilder right = new StringBuilder(left);
        right.reverse();

        // 6. Create palindrome
        StringBuilder palindrome = new StringBuilder();

        palindrome.append(left);

        if (count == 1) {
            palindrome.append(mid);
        }

        palindrome.append(right);

        // 7. Print result
        System.out.println(palindrome);
    }
}