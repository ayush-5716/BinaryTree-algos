/*
static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
*/

public static int countNodes(Node root){
  if(root==null){
    return 0;
  }
  
  int leftCount = countNodes(root.left);
  int rightCount = countNodes(root.right);
  
  return leftCount + rightCount + 1;
}
