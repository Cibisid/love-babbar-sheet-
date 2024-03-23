class Solution {
    int find(int dp[],int n){
        if(n == 1){
            return 1;
        }
        if(dp[n] != -1)return dp[n];
        return dp[n] = (find(dp,n-1)+find(dp,n-2))%1000000007;
    }

    int[] Series(int n) {
        // code here
        int ans[] = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i = 2; i <= n ; i++)ans[i] = -1;
        int res = find(ans,n);
        return ans;
    }
}