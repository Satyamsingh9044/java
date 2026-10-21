//lc-152. Maximum Product Subarray

class maxProduct {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int pre=1;
        int suf=1;
        for(int i=0;i<n;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre=pre*nums[i];
            suf=suf*nums[n-i-1];
            ans=Math.max(ans, Math.max(pre,suf));
        }
        return ans;
    }
}