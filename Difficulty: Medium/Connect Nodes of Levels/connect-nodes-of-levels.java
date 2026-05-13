/*
   class Node{
       int data;
       Node left;
       Node right;
       Node nextRight;
       Node(int data){
           this.data = data;
           left=null;
           right=null;
           nextRight = null;
       }
   }

   */

class Solution {
    public Node connect(Node root) {
        // code here.
         if(root == null || root.left == null){
            return root;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        Node prev = null;
        while(q.size()>0){
            Node curr = q.peek();
            q.poll();

            if(curr == null){
                if(q.size() == 0){
                    break;
                }
                q.add(null);
            }
            else{
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                if(prev != null){
                    prev.nextRight = curr;
                }
            }
            prev = curr;
        }
        return root;
    }
}