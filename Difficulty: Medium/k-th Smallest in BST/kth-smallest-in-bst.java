/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    int prevOrder = 0;
    public int kthSmallest(Node root, int k) {
        // code here
        if(root == null){
            return -1;
        }
        if(root.left != null){
            int leftAns = kthSmallest(root.left, k);
            if(leftAns != -1){
                return leftAns;
            }
        }
        if(prevOrder+1 == k){
            return root.data;
        }
        prevOrder = prevOrder + 1;

        if(root.right != null){
            int rightAns = kthSmallest(root.right, k);
            if(rightAns != -1){
                return rightAns;
            }
        }
        return -1;
    }
}