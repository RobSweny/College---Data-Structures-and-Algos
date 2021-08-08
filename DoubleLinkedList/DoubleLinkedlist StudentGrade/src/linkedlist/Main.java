package linkedlist;

public class Main {

    public static void main (String[] args){
        LinkedList<StudentGrades> linkedlist = new LinkedList<StudentGrades>();

        StudentGrades rob = new StudentGrades("Rob", "Math", 50.8);
        StudentGrades mark = new StudentGrades("Mark", "History", 95.2);
        StudentGrades eric = new StudentGrades("Eric", "Art", 25.2);
        StudentGrades john = new StudentGrades("John", "Music", 45.2);


        linkedlist.add(rob);
        linkedlist.add(mark);
        linkedlist.add(eric);
        linkedlist.add(john);

        System.out.println("Check if LinkedList is empty: " + linkedlist.isEmpty());
        System.out.println("Size of LinkedList: " + linkedlist.size());

        System.out.println("\nPrinting LinkedList");
        System.out.println(linkedlist + "\n");

        linkedlist.remove("Math");


        System.out.println("\nPrinting LinkedList");
        System.out.println(linkedlist + "\n");

        System.out.println("The average grade in the LinkedList: " + String.format("%.2f", linkedlist.average()));
    }
}
