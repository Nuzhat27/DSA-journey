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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> iMap = new HashMap<>();
        for(int i = 0 ; i < inorder.length ; i ++){
            iMap.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1,  iMap);
        return root;
    }
    private TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd, HashMap<Integer,Integer> iMap){
        //Base case
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        TreeNode root = new TreeNode(pre[preStart]);

        int inRoot = iMap.get(root.val);

        int numsLeft = inRoot - inStart;

        //Recursively build left subtree
        root.left = buildTree(pre, preStart + 1, preStart + numsLeft, in, inStart, inRoot - 1, iMap);

        //Recursively build right subtree
        root.right = buildTree(pre, preStart + numsLeft + 1, preEnd, in, inRoot + 1, inEnd, iMap);
        
        return root;
    }
}