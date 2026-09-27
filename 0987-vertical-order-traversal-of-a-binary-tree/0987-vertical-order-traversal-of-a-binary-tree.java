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
    static class Tuple {
        TreeNode node;
        int x, y;

        Tuple(TreeNode node, int x, int y) {
            this.node = node;
            this.x = x;
            this.y = y;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> nodesMap = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0, 0));
        while (!q.isEmpty()) {
            Tuple tp = q.poll();
            TreeNode node = tp.node;
            int x = tp.x;
            int y = tp.y;
            nodesMap.putIfAbsent(x, new TreeMap<Integer, PriorityQueue<Integer>>());
            nodesMap.get(x).putIfAbsent(y, new PriorityQueue<Integer>());
            nodesMap.get(x).get(y).offer(node.val);
            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }
        for (TreeMap<Integer, PriorityQueue<Integer>> yMap : nodesMap.values()) {
            List<Integer> col = new ArrayList<>();
            for (PriorityQueue<Integer> pq : yMap.values()) {
                while (!pq.isEmpty()) {
                    col.add(pq.poll());
                }
            }
            res.add(col);
        }

        return res;
    }
}