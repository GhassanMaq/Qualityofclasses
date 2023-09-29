
import java.util.List;

public interface StudentInterface {
    public void addCourse(CourseInterface Course);

    public int getStudentID();

    public String getEmail();

    public String getName();

    public List<CourseInterface> getEnrolledCourses();

    public void setStudentID(int studentID);

    public void setName(String name);

    public void setEmail(String email);


    public void removeCourse(CourseInterface course);

    public void enrollInCourse(CourseInterface course);

}
