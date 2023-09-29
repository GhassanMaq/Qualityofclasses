public class Course implements CourseInterface {
    private int courseCode, maximumCapacity;
    private String title, instructor;

    public Course(int courseCode, int maximumCapacity, String title, String instructor) {
        this.courseCode = courseCode;
        this.maximumCapacity = maximumCapacity;
        this.title = title;
        this.instructor = instructor;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String toString() {
        return "Course: " +
                "courseCode=" + courseCode +
                ", maximumCapacity=" + maximumCapacity +
                ", title='" + title + '\'' +
                ", instructor='" + instructor + '\'' +
                '.' + '\n';
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

}
