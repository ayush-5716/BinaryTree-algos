/* TO CREATE BINARY TREE FROM ARRAY OF VALUES */
/*
Node defination -
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

static int index=-1;
    public static Node treeBuilder(int[] vals){

        index++;

        if(vals[index] == -1){
            return null;
        }

        Node newNode = new Node(vals[index]);
        newNode.left = treeBuilder(vals);
        newNode.right = treeBuilder(vals);

        return newNode;

    }
