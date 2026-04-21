/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        traverse(root, ans);
        return ans;
        
    }
    public void traverse(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        
        traverse(root.left, ans);
        ans.add(root.data);
        traverse(root.right, ans);
    }
}