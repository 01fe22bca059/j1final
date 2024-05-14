package J1;

class Course {
    String courseCode;
    String courseName;
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;}}
class Student {
    String studentName;
    String program;
    int semester;
    Map<Course, Integer> marks;
    public Student(String studentName, String program, int semester) {
        this.studentName = studentName;
        this.program = program;
        this.semester = semester;
        this.marks = new HashMap<>();    }
    public void registerCourse(Course course, int marks) {
        this.marks.put(course, marks); }}
public class StudentCourseDetails {
    public static void main(String[] args) {
        // Course details
        Course mathCourse = new Course("MATH101", "Mathematics");
        Course compSciCourse = new Course("CS101", "Computer Science");
        // Student details
        Student student1 = new Student("Alice", "Engineering", 2);
        Student student2 = new Student("Bob", "Computer Science", 1);
        // Registering courses for students
        student1.registerCourse(mathCourse, 75);
        student1.registerCourse(compSciCourse, 35);
        student2.registerCourse(mathCourse, 80);
        student2.registerCourse(compSciCourse, 65);
        // Retrieve student and course details
        System.out.println("Student 1 Details:");
        System.out.println("Name: " + student1.studentName);
        System.out.println("Program: " + student1.program);
        System.out.println("Semester: " + student1.semester);
        System.out.println("Courses Registered:");
        for (Map.Entry<Course, Integer> entry : student1.marks.entrySet()) {
            System.out.println(entry.getKey().courseName + " (Code: " + entry.getKey().courseCode + ")"); }
        System.out.println();
        // Retrieve marks less than 40
        System.out.println("Marks less than 40 for Student 1:");
        for (Map.Entry<Course, Integer> entry : student1.marks.entrySet()) {
            if (entry.getValue() < 40) {
                System.out.println("Course: " + entry.getKey().courseName + ", Marks: " + entry.getValue());}}}}
