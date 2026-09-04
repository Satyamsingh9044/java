/*
 * LeetCode 334 - Increasing Triplet Subsequence
 *
 * REVISION NOTE:
 * Brute Force approch:Take three pairs and for each pair check the condition.
 * TC:O(n^3)
 * SC:O(1)
 * 
 * Greedy approach:
 * 1. first  = smallest possible first element.
 * 2. second = smallest possible second element.
 * 3. If current number > second, an increasing triplet exists.
 *
 * Pattern:
 * first < second < third
 *
 * For every number:
 * if num <= first:
 *     update first
 * else if num <= second:
 *     update second
 * else:
 *     triplet found -> return true
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class TripletSeq {

    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {

            if (num <= first) {
                first = num;
            }
            else if (num <= second) {
                second = num;
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 0, 4, 6};

        boolean result = increasingTriplet(nums);

        System.out.println("Increasing Triplet Exists: " + result);
    }
}