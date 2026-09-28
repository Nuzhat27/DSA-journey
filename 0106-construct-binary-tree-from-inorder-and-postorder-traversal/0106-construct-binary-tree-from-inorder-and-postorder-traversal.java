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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> iMap = new HashMap<>();
        for(int i = 0; i < inorder.length ; i ++){
            iMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(postorder, 0, postorder.length - 1, inorder, 0 , inorder.length - 1, iMap);
        return root;
    }
    private TreeNode buildTree(int[] post, int postStart, int postEnd, int[] in, int inStart, int inEnd, HashMap<Integer, Integer> iMap){
        //Base case
        if(inStart > inEnd || postStart > postEnd)return null;

        TreeNode root = new TreeNode(post[postEnd]);

        int inRoot = iMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(post, postStart, postStart + numsLeft - 1, in, inStart, inRoot - 1, iMap);

        root.right = buildTree(post, postStart + numsLeft, postEnd - 1, in, inRoot + 1, inEnd, iMap);
        return root;
    }
}