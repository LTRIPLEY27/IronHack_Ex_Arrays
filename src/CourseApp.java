public class CourseApp {
    /*Suppose you are building a university registration application where students can track and select courses.
Create and instantiate a Course class with the fields classId, capacity, studentCount, and title and all getters and setters.*/
    public static void main(String args[]){
        Course coursera = new Course("123A", 45, 5, "PHILOSOPHY");

        System.out.println(coursera.toString());
    }

}
