// User function Template for Java

class Solution {
    public static Node nextRight = null;
    public static void flatten(Node root) {
        // code here
        nextRight = null;
        flattenHelper(root);
        
        }

        private static void flattenHelper(Node root) {
        if (root == null) {
            return;
        }

        flattenHelper(root.right);
        flattenHelper(root.left);

        root.right = nextRight;
        root.left = null;
        nextRight = root;
    }
}