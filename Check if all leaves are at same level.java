class Solution
{
    public int preorder(Node root,HashSet<Integer> h,int x)
    {
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
        {
            h.add(x);
            if(h.size()>1)
            return 1;
            else
            return 0;
        }
        if(preorder(root.left,h,x+1)==1)
        return 1;
        if(preorder(root.right,h,x+1)==1)
        return 1;
        return 0;
        
    }
    boolean check(Node root)
    {
    HashSet<Integer> h=new HashSet<Integer>();
	int f=preorder(root,h,0);
	return(f==1)?false:true;
    }
}