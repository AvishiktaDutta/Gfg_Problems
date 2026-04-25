class Solution {
    
    int getLevel(Node node, int data) {
        return findLevel(node, data, 1);
    }
    
    int findLevel(Node node, int data, int level) {
        if (node == null) {
            return 0;
        }
        
        if (node.data == data) {
            return level;
        }
        
        int left = findLevel(node.left, data, level + 1);
        if (left != 0) {
            return left;
        }
        
        return findLevel(node.right, data, level + 1);
    }
}