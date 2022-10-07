/*
consider a subTree, its height will be the maximum of the height on its left and height on its right. Applying same for all the subtrees in the main tree,
and we can get the total height.
*/

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

public static int heightOfTree(Node root){
  if(root==null){
    return 0;
  }
  int leftHeight = heightOfTree(root.left);
  int rightHeight = heightOfTree(root.right);
  return Math.max(leftHeight,rightHeight) + 1;
}
