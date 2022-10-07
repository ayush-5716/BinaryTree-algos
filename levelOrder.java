/*
Level order traversal logic used for binary tree is - 
-> Not done by using recursion but done by iteration
-> Use array
-> Logic -
	Store the first root Node in the queue and store null	after that.
	After that pop that node and print and add both its 	child to the queue.
	Pop next element in queue, this time it will be null.		Pop this null element and add null again to the queue
	Now pop the next element from the queue, and		print it and add the children of that element.
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
 }
 */


public static void levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);
        while(!que.isEmpty()){
            Node thisNode = que.poll();
            if(thisNode == null){
                System.out.println();
                if(que.isEmpty()){
                    break;
                }
                else{
                que.add(null);
                }
            }
            else{
            System.out.print(thisNode.val);
            if(thisNode.left!=null) que.add(thisNode.left);
            if(thisNode.right!=null) que.add(thisNode.right);
            }
        }
    }
