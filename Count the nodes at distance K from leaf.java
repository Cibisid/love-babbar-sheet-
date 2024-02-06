class Solution {
   
    public int printKDistantfromLeaf(Node root, int k) {
        if (root == null) { return 0; }

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int count = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size-- > 0) {
                Node current = queue.remove();

                if (isKDistanceFromLeaf(current, k)) { count++; }

                if (current.left != null) { queue.add(current.left); }
                if (current.right != null) { queue.add(current.right); }
            }
        }

        return count;
    }
    private boolean isKDistanceFromLeaf(Node node, int k) {
        if (node == null) { return false; }

        if ((node.left == null && node.right == null) && k == 0) { return true; }

        if ((node.left == null && node.right == null) || k <= 0) { return false; }

        boolean leftResult = isKDistanceFromLeaf(node.left, k - 1);
        boolean rightResult = isKDistanceFromLeaf(node.right, k - 1);

        return leftResult || rightResult;
    }
}