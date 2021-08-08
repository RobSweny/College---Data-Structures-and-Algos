package linkedlist;

import list.List;

import java.sql.SQLOutput;

public class LinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public double average() {
        double average = 0;
        if (isEmpty()) {
            System.out.println("There are no cars in the LinkedList");
            return 0;
        } else {
            Node<T> current;
            current = first;
            for (int i=0; i<size; i++) {
                average += ((StudentGrades) current.getData()).getSubjectGrade();
                current = current.getNext();
            }
            return average / size;
        }
    }

    @Override
    public void add(T elem) {
        if (isEmpty()) {
            Node<T> insertion = new Node<>(elem);
            first = insertion;
            last = first;
        } else {
            last.next = new Node<>(elem);
            last = last.next;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T remove(String subjectName) {
        if (isEmpty()) {
            System.out.println("There are no cars in the LinkedList");
            return null;
        } else {
            Node<T> current, previous;
            current = first;
            previous = null;
            for (int i=0; i<size; i++) {
                if (((StudentGrades) current.getData()).getSubjectName().equals(subjectName)){
                    // if we are not the first element
                    if (i != 0) {
                        previous.setNext(current.getNext());
                    } else {
                        first = first.getNext();
                    }
                    size--;
                    System.out.println("Removing: " + subjectName);
                    return (T) subjectName;
                }
                previous = current;
                current = current.getNext();
            }
            return null;
        }
    }

    public String toString()
    {
        String str = "";
        Node<T> curr;

        for (curr=first;curr!=null;curr = curr.getNext())
        {
            str = str + curr.getData();
            if (curr.getNext()!=null)
                str = str + " ->\n";
        }
        str = str + "\n-> NULL";
        return str;
    }

}
