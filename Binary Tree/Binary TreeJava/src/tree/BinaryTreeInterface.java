package tree;

import java.util.ArrayList;

public interface BinaryTreeInterface <T extends Comparable<T>>{

    public void insert (T elem);

    public boolean isEmpty();

    public ArrayList<T> inOrder();

    public boolean contains(T elem);


}

