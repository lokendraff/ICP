# Leetocde 2476. Closest Nodes Queries in a Binary Search Tree

  code -> 
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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        inOrder(root, sortedList);
        for(int t : queries){
            int min=-1, max=-1;
            int idx = Collections.binarySearch(sortedList, t);
            if(idx>=0){
                min = sortedList.get(idx);
                max = sortedList.get(idx);
            }else{
                int ip = -idx-1;
                if(ip>0){
                    min = sortedList.get(ip-1);
                }

                if(ip<sortedList.size()){
                    max = sortedList.get(ip);
                }
            }

            list.add(Arrays.asList(min, max));
        }

        return list;
    }

    public static void inOrder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
  
