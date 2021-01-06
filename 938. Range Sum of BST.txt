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

  public int rangeSumBST(TreeNode root, int low, int high) {

    Stack < TreeNode > stack = new Stack < >();
    stack.push(root);
    int answer = 0;

    while (!stack.isEmpty()) {
      TreeNode currentNode = stack.pop();
      if (currentNode != null) {

        if (currentNode.val >= low && currentNode.val <= high) {
          answer += currentNode.val;
        }
        if (currentNode.val > low) {
          stack.push(currentNode.left);
        }
        if (currentNode.val < high) {
          stack.push(currentNode.right);
        }
      }
    }

    return answer;
  }
}