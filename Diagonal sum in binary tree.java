class Tree {
    public static void solve(Node root, ArrayList<Integer> ans, int i){
        
        if(root == null){
            return;
        }
        
        if(ans.size() == i){
            ans.add(root.data); 
        } else {
            ans.add(i, ans.get(i) + root.data);
            ans.remove(i+1);
        }
        solve(root.left, ans, i+1);
        solve(root.right, ans, i);
        
        
    }
    
    public static ArrayList <Integer> diagonalSum(Node root) 
    {
        // code here.
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        solve(root, ans, i);
        return ans;
    }
}