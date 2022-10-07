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
//PREORDER
public static void preOrder(Node root){
  if(root==null){
    return;
  }
  System.out.println(root.val + " ");
  preOrder(root.left);
  preOrder(root.right);
}

//INORDER
public static  void inOrder(Node root){
  if(root==null){
    return;
  }
  inOrder(root.left);
  System.out.println(root.val + " ");
  inOrder(root.right);
}

//POSTORDER
public static  void postOrder(Node root){
  if(root==null){
    return;
  }
  postOrder(root.left);
  postOrder(root.right);
  System.out.println(root.val + " ");
}
