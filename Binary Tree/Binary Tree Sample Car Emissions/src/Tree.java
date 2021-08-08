public class Tree<T extends Comparable<T>>  {

    Node<T> root = null;

    public void insertNode  (T element) {
        if (root == null) {
            root = new Node<T>(element);
        } else {
            insertNode(root, element);
        }
    }

    private void insertNode(Node<T> current, T element) {
        if (element.compareTo(current.element) > 0 ) {
            // Go right
            if (current.right == null) {
                current.right = new Node<T> (element);
                return;
            } else {
                // go further down the tree
                insertNode(current.right, element);
            }
        } else {
            // Go left
            if (current.left == null) {
                current.left = new Node<T> (element);
                return;
            } else {
                // go further down the tree
                insertNode(current.left, element);
            }
        }
    }

    public String preOrder() {
        return preOrder(root, "");
    }

    private String preOrder(Node<T> node, String indent) {
        String val = "";
        if (node != null) {
            val += indent + node.element + "\n";
            indent += "  ";
            val += preOrder(node.left, indent);
            val += preOrder(node.right, indent);
        }
        // return empty string
        return val;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node<T> current) {
        if (current == null) {
            return;
        }
        inOrder(current.left);
        System.out.println(current);
        inOrder(current.right);
    }

}
