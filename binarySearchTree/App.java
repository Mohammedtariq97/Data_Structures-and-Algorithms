package algo.binarySearchTree;

public class App {

	public static void main(String[] args) {
		
		BST tree = new BST();
		
		tree.insert(10, "Ten");
		tree.insert(20, "Twenty");
		tree.insert(30, "Thirty");
		tree.insert(40, "Forty");
		tree.insert(50, "fifty");
		tree.insert(60, "Sixty");

		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
		
		System.out.println(tree.remove(30));
		
	}

}
