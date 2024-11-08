class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Performed a binary search to find LCA

        // Value occurs when yourre inbetween treeNodes or basically part of the TreeNodes being
        // searched for
        while(root != null ){
            if(root.val < p.val && root.val < q.val){
                root = root.right ;
            }else if(root.val > p.val && root.val > q.val){
                root = root.left ;
            }else{
                return root ;
            }
        }

        return root ;
    }
}
