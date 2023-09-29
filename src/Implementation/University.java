import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class University {
    private List<StudentInterface> students;
    private List<CourseInterface> courses;

    public List<StudentInterface> getStudents() {
        return students;
    }

    public void setStudents(List<StudentInterface> students) {
        this.students = students;
    }

    public List<CourseInterface> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseInterface> courses) {
        this.courses = courses;
    }

    private boolean studentExists(StudentInterface student) {
        return students.contains(student);
    }

    private boolean courseExists(CourseInterface course) {
        return courses.contains(course);
    }

    public String toString() {
        return "University:" +
                "students=" + students +
                ", courses=" + courses +
                '.' + '\n';
    }

    public University() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public String addCourse(CourseInterface course) {
        for (CourseInterface existingCourse : courses) {
            if (existingCourse.getCourseCode() == course.getCourseCode()) {
                return "Error: Course with code " + course.getCourseCode() + " already exists.";
            }
        }
        courses.add(course);
        return "Success: Course added.";
    }

    public String addStudent(StudentInterface student) {
        for (StudentInterface existingStudent : students) {
            if (existingStudent.getStudentID() == student.getStudentID()) {
                return "Error: Student with ID " + student.getStudentID() + " already exists.";
            }
        }
        students.add(student);
        return "Success: Student added.";
    }


    public String enrollStudent(StudentInterface student, CourseInterface course) {
        if (!(studentExists(student) || courseExists(course)) && (student.getEnrolledCourses().contains(course))) {
            return "Error: Student or course does not exist, or student is already enrolled in the course.";
        }
        student.enrollInCourse(course);
        return "Success: Student enrolled in the course.";
    }

    public String dropStudentsFromCourse(StudentInterface student, CourseInterface course) {
        if (!(studentExists(student) || courseExists(course) || student.getEnrolledCourses().contains(course))) {
            return "Error: Student or course does not exist, or student is not enrolled in the course.";
        }
        student.removeCourse(course);
        return "Success: Student dropped from the course.";
    }


    public void coursesReport() {
        System.out.println(courses);
    }

    public void studentCourseReport(StudentInterface student) {
        System.out.println(student.getEnrolledCourses());
    }

    public void courseStudentsReport(CourseInterface course) {
        List<StudentInterface> studentsEnrolledInCourse = new ArrayList<>();
        for (StudentInterface student : students) {
            if (student.getEnrolledCourses().contains(course)) {
                studentsEnrolledInCourse.add(student);
            }
        }
        System.out.println(studentsEnrolledInCourse);
    }

    public void generalReport(CourseInterface course, StudentInterface student) {
        coursesReport();
        studentCourseReport(student);
        courseStudentsReport(course);
    }

}
