//23 BST level traversal
static void levelRoot(Node root){
	Queue<Node> q=new LinkedList<Node>;
	q.add(root);
	while(q!=NULL){
		Node node=q.remove();
		System.out.print(" "+node);
		if(node.left!=NULL){
			q.add(node.left);
		}
		if(node.right!=NULL){
			q.add(node.right);
		}
	}
}