import java.util.ArrayList;
class Student extends User {
    protected ArrayList<String> enrolledCourse;

    public Student(String name, int id) {
        super(name, id);
        enrolledCourse = new ArrayList<>();
    }

    public void enrollInCourse(String course) {
        enrolledCourse.add(course);
    }

    @Override
    public String getUserDetails() {
        return "Student - " + super.getUserDetails() + "\nEnrolled Courses: " + enrolledCourse;
    }
}
