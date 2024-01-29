class Solution
{
    
    public int grouping(String str, int ind, int sum,int dp[][]){
        
        if(ind==str.length())return dp[ind][sum]= 1;
        
        if(dp[ind][sum]!=-1)return dp[ind][sum];
        int currentSum=0;
        int ans=0;
        for(int i=ind;i<str.length();i++){
            currentSum+=str.charAt(i)-'0';
            if(currentSum>=sum){
                ans+=grouping(str, i+1, currentSum,dp);
            }
        }
        
        return  dp[ind][sum]=ans;
    }
    
    
    public int TotalCount(String str)
    {
        int size=9*str.length();
        int dp[][]=new int[str.length()+1][size+1];
        for(int p[]:dp){
            Arrays.fill(p,-1);
        }
        
        return  grouping(str,0,0,dp);
    }
}