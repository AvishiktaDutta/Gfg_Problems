/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean helper(Node root, Node min, Node max){
        if(root == null){
            return true;
        }
        if(min != null && root.data<=min.data){
            return false;
        }
        if(max != null && root.data>=max.data){
            return false;
        }

        return helper(root.left, min, root) && helper(root.right, root, max);
    }
    public boolean isBST(Node root) {
        // code here
        return helper(root, null, null);
    }
}