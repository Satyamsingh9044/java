import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int count[] = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i : count) {
                sb.append("#").append(i);
            }
            String key = sb.toString();

            map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);
    }
}



//one more method by sorting 
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();

//         for (String s : strs) {
//             char[] arr = s.toCharArray();
//             Arrays.sort(arr);
//             String key = new String(arr);

//             if(map.containsKey(key)){
//                 map.get(key).add(s);
//             }else{
//                 List<String> list = new ArrayList<>();
//                 list.add(s);
//                 map.put(key, list);
//             }
//         }

//         // Return all grouped lists
//         return new ArrayList<>(map.values());
//     }
// }