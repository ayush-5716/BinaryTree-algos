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

public static int diameter(Node root){
  if(root == null){
    return 0;
  }
  
  int diamRoot = Height(root.left) + Height(root.right) + 1;  //height function defined below
  int diamLeft = diameter(root.left);
  int diamRight = diameter(root.right);
  
  return Math.max(diamRoot,Math.max(diamLeft,diamRight));
}



//function to calculate height
public static Height(Node root){
  if(root == null){
    return -;
  }
  
  int heightLeft = Height(root.left);
  int HeightRight = Height(root.right);
  
  return Math.max(heightLeft,heightRight) + 1;
}
