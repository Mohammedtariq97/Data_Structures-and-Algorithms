package algo.binarySearchTree;

public class BST {

	private Node root;

	public void insert(int key, String value) {

		Node newNode = new Node(key, value);

		if (root == null) {

			root = newNode;
		} else {
			Node current = root;
			Node parent;

			while (true) {
				parent = current;

				if (key < current.key) {

					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;

					}  
				}else {
						current = current.rightChild;
						if (current == null) {
							parent.rightChild = newNode;
							return;
						   }
					}
				}
			}
		}
	
	
	public Node findMin() {
		
		Node current = root;
		Node last = null;
		
		while(current!= null) {
			last = current;
			current= current.leftChild;			
		}		
		return last;	
	}
	
	public Node findMax() {
		
		Node current = root;
		Node last = null;
		
		while(current!= null) {
			last = current;
			current= current.rightChild;			
		}		
		return last;	
	}
	
	public boolean remove(int key) {
		
		Node currentNode = root;
		Node parentNode = root;
		
		boolean isleftChild = false;
		
		while(currentNode.key !=key) {
			
			parentNode = currentNode;
			
			if(key< currentNode.key) {
				isleftChild = true;
				currentNode = currentNode.leftChild;
				
			}else {
				isleftChild = false;
				currentNode = currentNode.rightChild;
				
			}
			if(currentNode == null) {
				return false;
			}
		}
			
		Node nodetoDelete = currentNode;
		
		if(nodetoDelete.leftChild == null && nodetoDelete.rightChild == null) {
			
			if(nodetoDelete == root) {
				root = null;
				
			}else if(isleftChild){
				parentNode.leftChild = null;
				
			}else {
				parentNode.rightChild = null;
			}		
		}
		
		else if( nodetoDelete.rightChild == null ) {
			
			if(nodetoDelete == root) {
				
				root = nodetoDelete.leftChild;
			}else if(isleftChild) {
				parentNode.leftChild = nodetoDelete.leftChild;
				
			}else {
				parentNode.rightChild = nodetoDelete.leftChild;
			}			
		}
		else if(nodetoDelete.leftChild == null) {
			
			if(nodetoDelete == root) {
				
				root = nodetoDelete.rightChild;
			}else if(isleftChild) {
				parentNode.leftChild = nodetoDelete.rightChild;
				
			}else {
				parentNode.rightChild = nodetoDelete.rightChild;
			}			
		}
		
		else {
			Node successor = getSuccessor(nodetoDelete);
					
			if(nodetoDelete== root){		
				root = successor;
				
			}else if( isleftChild) {			
				parentNode.leftChild = successor;
			}else {
				parentNode.rightChild = successor;
			}
			successor.leftChild= nodetoDelete.leftChild;
		}
		return true;	
	}

	private Node getSuccessor(Node nodetoDelete) {
			
		Node successorParent = root;
		Node successor = root;
		
		Node current = nodetoDelete.rightChild;
		
		while(current!= null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		
		if(successor!= nodetoDelete.rightChild) {
			
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = nodetoDelete.rightChild;
		}
		return successor;
	}
	
}
		
		
		
	


