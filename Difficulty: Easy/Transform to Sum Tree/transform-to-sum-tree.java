/* A binary tree node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public int toSumTree(Node node) {
        // code here
        if(node == null){
            return 0;
        }
         
        int oldValue = node.data;
        int leftSum = toSumTree(node.left);
        int rightSum = toSumTree(node.right);
        node.data = leftSum + rightSum;
        return oldValue+node.data;
    }
}