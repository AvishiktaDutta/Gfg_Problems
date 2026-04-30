/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node getInorderSuccessor(Node root){ // InorderSuccessor = leftmost child of right subtree
        while(root != null && root.left != null){
            root = root.left;
        }
        return root;
    }
    public Node delNode(Node root, int x) {
         if(root == null){
            return null;
         }
         if(x < root.data){
            root.left = delNode(root.left, x);
         }
         else if(x > root.data){
            root.right = delNode(root.right, x);
         }
         else{
            //root = key
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                Node IS =  getInorderSuccessor(root.right);
                root.data = IS.data;
                root.right = delNode(root.right, IS.data);
            }
         }
         return root;
    }
}