//brute force lc-3483

class unique3digit {
    public int totalNumbers(int[] digits) {
        Set<Integer> seen = new HashSet<>();
        int n = digits.length;

        for (int h = 0; h < n; h++) {
            if (digits[h] == 0) continue;

            for (int t = 0; t < n; t++) {
                if (t == h) continue;

                for (int u = 0; u < n; u++) {
                    if (u == h || u == t) continue;

                    if (digits[u] % 2 != 0) continue;

                    int num = digits[h] * 100 + digits[t] * 10 + digits[u];
                    seen.add(num);
                }
            }
        }

        return seen.size();
    }
}

//optimal

class Solution {
    public int totalNumbers(int[] digits) {
        int[] f = new int[10];
        int res = 0;

        for (int d : digits) f[d]++;

        for (int i = 1; i < 10; i++) 
            for (int j = 0; j < 10; j++) 
                for (int k = 0; k < 9; k += 2) {
                    f[i]--; f[j]--; f[k]--;

                    if (f[i] >= 0 && f[j] >= 0 && f[k] >= 0) res++;

                    f[i]++; f[j]++; f[k]++;
                }           
        

        return res;
    }
}