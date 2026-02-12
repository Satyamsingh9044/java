// public class LongBalSub {
    
// }

// lc-3719 Longest Balanced SubArray
// class Solution {
//     public int longestBalanced(int[] nums) {
//         int max=0;
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 Set<Integer> odd=new HashSet<>();
//                 Set<Integer> even=new HashSet<>();
//                 for(int k=i;k<=j;k++){
//                     if(nums[k]%2==0){
//                         even.add(nums[k]);
//                     }else{
//                         odd.add(nums[k]);
//                     }
//                 }
//                 if(odd.size()==even.size()&&(j-i+1)>max){
//                     max=(j-i+1);
//                 }
//             }
//         }
//         return max;
//     }
// }