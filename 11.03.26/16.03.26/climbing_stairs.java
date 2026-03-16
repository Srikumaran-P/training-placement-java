class Solution {
    public int climbStairsB(int n) {
        if(n==0||n==1)return 1;
        return climbStairs(n-1)+climbStairs(n-2);
        // Time Limit Exceeded 31 / 45 testcases passed
    }
    public int climbStairsO(int n) {
        if(n==0||n==1)return 1;
        int[]dp=new int[n+1];
        dp[0]=dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        if(n==0||n==1)return 1;
        int prev=1,curr=1;
        for(int i=2;i<=n;i++){
            int tmp=curr;
            curr+=prev;
            prev=tmp;
        }
        return curr;
    }

}
