/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int ans = 0;
    public int height(Node root){
        if(root == null){
            return 0;
        }
        int LH = height(root.left);
        int RH = height(root.right);
        ans = Math.max(ans, LH+RH);
        return Math.max(LH, RH) + 1;
    }
    public int diameter(Node root) {
        // code here
        height(root);
        return ans;
    }
}