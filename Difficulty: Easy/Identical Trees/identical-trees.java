/*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // code here
         if(r1 == null || r2 == null){
            return r1 == r2;
        }

        boolean isSafeLeft = isIdentical(r1.left, r2.left);
        boolean isSafeRight = isIdentical(r1.right, r2.right);
        return isSafeLeft && isSafeRight && (r1.data == r2.data);
    }
}