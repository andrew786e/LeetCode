class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // If we have reached a node that has value or reached the end return itself
        // No need to search
        if(root == null || p.val == root.val || q.val == root.val){
            return root ;
        }

        TreeNode left = lowestCommonAncestor(root.left , p , q) ; 
        TreeNode right = lowestCommonAncestor(root.right , p , q) ;

        // If its children found nodes that means its a parent
        if(left != null && right != null){
            return root ;
        } 

        // Return the value from the children if parent is not the commonAncestor ;
        return left != null ? left : right;
    }
}
