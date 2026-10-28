//lc-70. Climbing Stairs
//Approch-1
//Recursion -TLE  T.C=O(2^n)
class climbingStairs {

    public int climbStairs(int n) {
        if (n == 0) return 1;
        if(n<0) return 0;

        return climbStairs(n-1) + climbStairs(n-2);
    }
}



//Approch-2
//recursion+memoization T.C=O(n)
class Solution {
    public int climbStairs(int n) {
    int dp[]=new int[n+1];
    return countWays(n,dp);
    
        
    }

     private int countWays(int n,int dp[]){
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]= countWays(n-1,dp)+countWays(n-2,dp);

        return dp[n];
     }
}

//Approch-3
//Tabulation
class Solution2 {
    public int climbStairs(int n) {
    int dp[]=new int[n+1];
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
        
    }
}