
public class BSTApp {

	public static void main(String[] args) {

		//BinarySearchTree<Integer> BST = new BinarySearchTree<>();
		
		IntegerBST IntBST = new IntegerBST(); 
		
		IntBST.insert(1);
		IntBST.insert(5);
		IntBST.insert(2);
		IntBST.insert(8);
		IntBST.insert(6);
		IntBST.insert(1);
		System.out.println(IntBST.inOrder());

		System.out.println(IntBST.sum());
		System.out.println(IntBST.product());
	
	}
}

