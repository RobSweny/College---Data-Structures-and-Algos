package tree;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>> implements BinaryTreeInterface<T> {

    private BinaryTreeNode<T> root;

    /**
     * Function to add node to root, if not insert further down the tree
     * @param elem
     */
    @Override
    public void insert(T elem) {
        if (isEmpty()) {
            root = new BinaryTreeNode<T>(elem);
        } else {
            insert(elem, root);
        }
    }

    /**
     * Insert into binary tree
     * @param elem
     * @param current
     */
    private void insert(T elem, BinaryTreeNode<T> current) {
        // CompareTo gives us -1 if it's less than, 0 if it's equal and 1 if it's greater than
        if (elem.compareTo(current.element) == -1) {
            if (current.left == null ) {
                current.left = new BinaryTreeNode<>(elem);
            } else {
                insert(elem, current.left);
            }
        } else {
            if (current.right == null ) {
                current.right = new BinaryTreeNode<>(elem);
            } else {
                insert(elem, current.right);
            }
        }
    }

    /**
     * @return if the BinaryTree is empty
     */
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    public ArrayList<T> inOrder(){
        ArrayList<T> lst = new ArrayList<T>();
        inOrder(root, lst);
        return lst;
    }

    private void inOrder(BinaryTreeNode<T> root, ArrayList<T> lst){
        if(root != null){
            System.out.println(root.toString());
            inOrder(root.left, lst); 	//process left sub-tree
            lst.add(root.element); 		//process the root
            inOrder(root.right,lst); 	//process right sub-tree
        }
    }

    @Override
    public boolean contains(T elem) {
        return contains (elem, root);
    }

    /**
     * @param elem
     * @param current
     * @return
     */
    private boolean contains (T elem, BinaryTreeNode<T> current) {
        String currentPosition = (current == null ? "NULL" : current.element.toString());
        System.out.println("Searching for " + elem + " currently at " + currentPosition);
        if (current == null) {
            return false;
        }
        if (elem.compareTo(current.element) <= 0) {
            return true;
        } else if (elem.compareTo(current.element) <= -1) {
            return contains(elem, current.left);
        } else {
            return contains(elem, current.right);
        }
    }


}
