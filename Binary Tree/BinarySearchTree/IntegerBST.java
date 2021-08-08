
public class IntegerBST extends BinarySearchTree<Integer> {

	//private BTNode<Integer> root;
	
	
	public int sum() {
		return sum(root);
	}
	private int sum(BTNode<Integer> node) {
		if(node == null) {
			return 0;
		}
		else {
			return (int)node.element + sum(node.left) + sum(node.right);
		}	
	}
	
	
	public int product() {
		return product(root);
	}
	
	private int product(BTNode<Integer> node) {
		if(node == null) {
			return 1;
		}
		
		else {
			return (int) node.element * product(node.left) * product(node.right);
		}
	}
	
}
