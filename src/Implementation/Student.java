import java.util.ArrayList;
import java.util.List;

public class Student implements StudentInterface {
    private int studentID;
    private String name;
    private String email;
    private List<CourseInterface> enrolledCourses;

    // Constructor
    public Student(int studentID, String name, String email) {
        this.studentID = studentID;
        this.name = name;
        this.email = email;
        this.enrolledCourses = new ArrayList<>();
    }

    public String toString() {
        return "Student: " +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", enrolledCourses=" + enrolledCourses +
                '.' + '\n';
    }

    // Getter and Setter methods
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CourseInterface> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollInCourse(CourseInterface course) {
        this.enrolledCourses.add(course);
    }

    public void removeCourse(CourseInterface course) {
        this.enrolledCourses.remove(course);
    }

    // Implementing the addCourse method from the StudentInterface
    @Override
    public void addCourse(CourseInterface course) {
        enrollInCourse(course);
    }
}

