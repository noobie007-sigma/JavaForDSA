package oops3.learnPackages;

public class Teacher {
    public int teachingClass; //Available everywhere
    private int teacherID; //Available only in this class
    String degree; //default fields are available in only that package in which they're defined.
    protected int studentsCount;

    public static void main(String[] args) {
//        teachingClass = 12; -> teachingClass is non-static, hence it cannot be accessed from static reference. That
//        means, to access teachingClass, we have to create an object of Teacher class.

        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.teacherID = 123; //private fields are only accessible in the class in which they're defined.
        System.out.println(obj.teacherID);
        obj.degree = "B.Ed.";
    }

}
