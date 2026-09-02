 //Company Tags                : Google, HCL, IBM, HCL, Accenture
 //Leetcode Link               : https://leetcode.com/problems/find-original-array-from-doubled-array/
 //lc-2007


//Approach-1 (Using sorting and map)
import java.util.*;
class OriginalFromDuplicate {
    public int[] findOriginalArray(int[] changed) {

        if (changed.length % 2 != 0) {
            return new int[0];
        }

        Arrays.sort(changed);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : changed) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int num : changed) {

            // Already used
            if (map.get(num) == 0) {
                continue;
            }

            // No 2*num available
            if (map.getOrDefault(num * 2, 0) == 0) {
                return new int[0];
            }

            // Use num
            list.add(num);
            map.put(num, map.get(num) - 1);

            // Use 2*num
            map.put(num * 2, map.get(num * 2) - 1);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}