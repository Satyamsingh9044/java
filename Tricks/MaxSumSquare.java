//lc-3723. Maximize Sum of Squares of Digits
// 🪜 Approach
// 🧩 One idea: squares love big digits — 9² + 0² = 81 is far more than 5² + 4² = 41,
//  even though both use the same digit sum 9.
// 📐 So we pile the sum into as few big digits as possible:
//  as many 9s as we can, then the leftover, then 0s. Putting the big digits first also makes the number itself the biggest.

class MaxSumSquare {
    public String maxSumOfSquares(int num, int sum) {
        // Step 1: the biggest possible digit sum is 9 * num
        if (sum > 9 * num) return "";

        StringBuilder ans = new StringBuilder();

        // Step 2: fill every position from left to right
        while (num-- > 0) {
            int digit = Math.min(9, sum);   // take as much as we can, at most 9
            ans.append(digit);
            sum -= digit;
        }

        return sum == 0 ? ans.toString() : "";
    }
}