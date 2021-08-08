package list;

public interface List<T> {
    public boolean isEmpty();

    public double average();

    public void add (T elem);

    public T remove (String subjectName);

    public int size();
}
