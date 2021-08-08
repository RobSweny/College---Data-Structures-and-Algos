package linkedlist;

public class StudentGrades {
    String studentName;
    String subjectName;
    double subjectGrade;

    public StudentGrades(String studentName, String subjectName, double subjectGrade) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.subjectGrade = subjectGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSubjectGrade() {
        return subjectGrade;
    }

    public void setSubjectGrade(double subjectGrade) {
        this.subjectGrade = subjectGrade;
    }

    @Override
    public String toString() {
        return "StudentGrades{" +
                "studentName='" + studentName + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectGrade=" + subjectGrade +
                '}';
    }
}
