class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>(5);
        for ( int i = 1; i <= n; i++ )
        {
            if(i==arr[i-1])
                list.add(i);
        }
        list.trimToSize();
        return list;
    }
}