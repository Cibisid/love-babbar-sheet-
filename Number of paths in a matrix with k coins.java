class Solution {
    long count= 0;
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        
        check(0,0,k,arr,n,0);
        return count;
    }
    
    void check(int i,int j,int k,int arr[][],int n,int sum) {
        if(i>=n||j>=n) {
            return;
        }
        sum+=arr[i][j];
        if(sum>k) {
            return;
        }
        
        if(i ==n-1 && j==n-1 && sum==k) {
            count++;
        }
        check(i+1,j,k,arr,n,sum);
        check(i,j+1,k,arr,n,sum);
    }
}