import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>> implements BinaryTree<T> {

	public BTNode<T> root;
	
	public void insert(T elem) {
		if (isEmpty()) {
			root = new BTNode<>(elem);
		} else {
			insertNode(elem, root);
		}
	}

	private void insertNode(T elem, BTNode<T> current) {
		if (elem.compareTo(current.element) == -1) {
			if (current.left == null) {
				current.left = new BTNode<>(elem);
			} else {
				insertNode (elem, current.left);
			}
		} else {
			if (current.right == null) {
				current.right = new BTNode<>(elem);
			} else {
				insertNode(elem, current.right);
			}
		}
	}

	public boolean isEmpty() {
		
		return root == null;
	}
	
	public ArrayList<T> inOrder(){
		ArrayList<T> lst = new ArrayList<T>();
		inOrder(root, lst);
		return lst;
	}
	
	private void inOrder(BTNode<T> root, ArrayList<T> lst){
		if(root != null){
			System.out.println(root.toString());
			inOrder(root.left, lst); 	//process left sub-tree
			lst.add(root.element); 		//process the root
			inOrder(root.right,lst); 	//process right sub-tree
		}
	}
	
	public boolean contains(T element) {
		// TODO Auto-generated method stub
		return contains(element,root);
	}
	
	public boolean contains(T element, BTNode<T> current) {
		String currentPos = (current == null ? "NULL" : current.element.toString());
		System.out.println("Searching for "+ element + " currently at " + currentPos);
		if (current == null) {
			return false;
		}
		if (element.compareTo(current.element)==0) {
			return true;
		} else if (element.compareTo(current.element)<=-1) {
			return contains(element, current.left);
		} else {
			return contains(element, current.right);
		}
	}
	
	
	private BTNode<T> findNode(T element){
		return findNode(element, root);
	}
	
	private BTNode<T> findNode(T element, BTNode<T> current){
		if (current == null) {
			return current;
		}
		if (element.compareTo(current.element)==0) {
			return current;
		} else if (element.compareTo(current.element)<=-1) {
			return findNode(element, current.left);
		} else {
			return findNode(element, current.right);
		}
	}

}
