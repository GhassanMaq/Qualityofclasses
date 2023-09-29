// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        University uni = new University();
        Course course = new Course(1100, 40, "Software Engineering", "Ahmad");
        Course course1 = new Course(110, 45, "Advanced Software Engineering", "Ahmad");
        Course course2 = new Course(1101, 25, "Digital Marketing 1", "Yasser");
        Course course3 = new Course(11083, 20, "UI/UX", "Ahmad");
        Course course4 = new Course(1100, 25, "Digital Marketing 1", "Yasser");
        uni.addCourse(course);
        uni.addCourse(course1);
        uni.addCourse(course2);
        uni.addCourse(course3);
        Student student = new Student(1, "Tahseen", "tahseen@gmail.com");
        Student student1 = new Student(1, "Tahseen", "tahseen@gmail.com");
        Student student2 = new Student(2, "Yasser", "Yasser@gmail.com");
        Student student3 = new Student(3, "Aysar", "Aysar@gmail.com");
        Student student4 = new Student(4, "Hasan", "Hasan@gmail.com");
        Student student5 = new Student(5, "Yaman", "Yaman@gmail.com");
        uni.addStudent(student);
        uni.addStudent(student1);
        uni.addStudent(student2);
        uni.addStudent(student3);
        uni.addStudent(student4);
        uni.addStudent(student5);
        uni.enrollStudent(student, course);
        uni.enrollStudent(student, course1);
        uni.enrollStudent(student, course3);
        uni.enrollStudent(student2, course);
        uni.enrollStudent(student2, course1);
        uni.enrollStudent(student2, course2);
        uni.enrollStudent(student3, course);
        uni.enrollStudent(student4, course2);
        uni.enrollStudent(student4, course2);
        uni.enrollStudent(student5, course2);
        uni.enrollStudent(student5, course1);
        uni.coursesReport();
        uni.courseStudentsReport(course1);
        uni.dropStudentsFromCourse(student2, course1);
        System.out.println("After Dropping Student 2: \n");
        uni.courseStudentsReport(course1);
        System.out.println("All Students Enrolled in Course 3");
        uni.courseStudentsReport(course3);
    }
}