import java.util.*;
class SlidingwinMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            //remove indices outside the cureent window
            if(!dq.isEmpty() && i-dq.peekFirst()+1>k){
                dq.pollFirst();
            }
            //remove indices of smaller elements from the back
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){    //deque ke starting me hamesa max element rahega
                dq.pollLast();
            }
            //Add currrent index
            dq.offerLast(i);
            //Add current max to result list
            if(i+1>=k){
                list.add(nums[dq.peekFirst()]);
            }
        }
        //convert list<Integer> to int[]
        int [] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int ans[]= maxSlidingWindow(arr,k);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}