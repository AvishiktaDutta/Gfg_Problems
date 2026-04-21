/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        traverse(root, ans);
        return ans;
        
    }
    public void traverse(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        
        traverse(root.left, ans);
        traverse(root.right, ans);
        ans.add(root.data);
    }
}