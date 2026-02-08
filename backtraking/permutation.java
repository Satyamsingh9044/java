public class permutation{
    public static void permutation(String str,String ans){
         //base case
         if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //Recursion
            for(int i=0;i<str.length();i++){
                char curr=str.charAt(i);
                String Newstr=str.substring(0,i)+str.substring(i+1);
                permutation(Newstr,ans+curr);
            }
    }
    public static void main(String[] args){
        String str="abc";
        permutation(str,"");
    }
}

// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         boolean[] used = new boolean[nums.length];
//         backtrack(nums, result, new ArrayList<>(), used);
//         return result;
//     }

//     private void backtrack(int[] nums, List<List<Integer>> result,
//                            List<Integer> temp, boolean[] used) {

//         if (temp.size() == nums.length) {
//             result.add(new ArrayList<>(temp));
//             return;
//         }

//         for (int i = 0; i < nums.length; i++) {
//             if (used[i]) continue;

//             temp.add(nums[i]);
//             used[i] = true;

//             backtrack(nums, result, temp, used);

//             // backtrack
//             temp.remove(temp.size() - 1);
//             used[i] = false;
//         }
//     }
// }


//permutation-II


// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         Arrays.sort(nums);
//         backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
//         return result;
//     }

//     private void backtrack(List<List<Integer>> result, List<Integer> temp,
//                            int[] nums, boolean[] used) {

//         if (temp.size() == nums.length) {
//             result.add(new ArrayList<>(temp));
//             return;
//         }

//         for (int i = 0; i < nums.length; i++) {

//             if (used[i]) continue;

//             // 🔥 Skip duplicates
//             if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

//             used[i] = true;
//             temp.add(nums[i]);

//             backtrack(result, temp, nums, used);

//             temp.remove(temp.size() - 1);
//             used[i] = false;
//         }
//     }
// }
