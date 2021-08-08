
public class BTNode<T> {
	protected T element;
	protected BTNode<T> left;
	protected BTNode<T> right;
	
	public BTNode(T element) {
		this.element = element;
	}
	
	public String toString() {
		String leftVal = (left == null ? "NULL" : left.element.toString());
		String rightVal = (right == null ? "NULL" : right.element.toString());
		return "BTNode{" + "element= " + element + ", left= " + leftVal + ", right=" + rightVal + "}";
	}
}
