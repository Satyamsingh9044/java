import java.util.*;
class CombinationalSum {
    static  Set<List<Integer>> set = new HashSet<>();
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> combin=new ArrayList<>();
        getAllCombinations(candidates,0,target,ans,combin);
        return ans;
    }
    public static  void getAllCombinations(int[]arr,int idx,int tar,List<List<Integer>> ans,List<Integer> combin){
        if(tar==0){
            if (!set.contains(combin)) {
                set.add(combin);
                ans.add(new ArrayList<>(combin));
            }
            return;
        }
        if(idx==arr.length || tar<0){
            return;
        }
        combin.add(arr[idx]);
        getAllCombinations(arr,idx+1,tar-arr[idx],ans,combin);
        getAllCombinations(arr,idx,tar-arr[idx],ans,combin);
        combin.remove(Integer.valueOf(arr[idx]));
        getAllCombinations(arr,idx+1,tar,ans,combin);
    }
    public static void main(String[] args) {
        int[]candidates={2,3,6,7};
        int target=7;
        System.out.print(combinationSum(candidates,target));
    }
}