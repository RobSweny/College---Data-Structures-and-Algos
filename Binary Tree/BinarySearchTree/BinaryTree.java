import java.util.ArrayList;

public interface BinaryTree <T extends Comparable<T>>{
	
	public void insert (T elem);
	
	public boolean isEmpty();
	
	public ArrayList<T> inOrder();
	
	public boolean contains(T elem);


}
