class Solution
{
    static int sum =0;
    public static void find(Node root){
        if(root == null)return;
        if(root.left == null && root.right == null){
            sum += root.data;
        }
        find(root.left);
        find(root.right);
    }
    public static int sumOfLeafNodes(Node root)
    {
        // code here 
        sum = 0;
        if(root.left == null && root.right == null)return root.data;
        find(root);
        return sum;
    }
}