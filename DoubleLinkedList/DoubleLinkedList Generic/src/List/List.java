package List;

public interface List <T> {

    boolean isEmpty();

    int size();

    void add(T elem);

    void add(int index, T elem);

    String toString();

    T remove (int index);

    T remove(T target);

    public void addFirst(T elem);
}
