/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public HashMap<Long, Integer> dict = new HashMap<Long, Integer>();
    public int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        dict.put(0L, 1); // Initialize the prefix sum with 0 sum count 1
        dfsPath(root, 0L, targetSum); // Start DFS with sum = 0
        return count;
    }

    public void dfsPath(TreeNode node, long currentSum, int targetSum) {
        if (node == null) {
            return;
        }

        currentSum += node.val; // Update the current sum with the node value
        long sumToCheck = currentSum - targetSum; // Calculate the required sum

        // Add to count if a valid path is found
        if (dict.containsKey(sumToCheck)) {
            count += dict.get(sumToCheck);
        }

        // Add the current sum to the prefix sum map or update its frequency
        dict.put(currentSum, dict.getOrDefault(currentSum, 0) + 1);

        // Recurse into left and right subtrees
        dfsPath(node.left, currentSum, targetSum);
        dfsPath(node.right, currentSum, targetSum);

        // Backtrack by removing the current sum from the map after recursion
        dict.put(currentSum, dict.get(currentSum) - 1);
    }
}
