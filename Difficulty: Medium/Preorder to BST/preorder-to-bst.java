/* class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    private int i = 0;
    // Function that constructs BST from its preorder traversal.
    public Node helper(int[] pre, int bound){
        if(i>=pre.length || pre[i]>bound){
            return null;
        }
        Node root = new Node(pre[i++]);
        root.left = helper(pre, root.data);
        root.right = helper(pre, bound);
        return root;

    }
    public Node preToBST(int pre[]) {
        // code here
        int i = 0;
      return helper(pre, Integer.MAX_VALUE);
        
    }
}