package week05.Inheritence;

//import week05.Inheritence.*;

public class InheritenceDemo {
    public static void main(String[] args) {
        // Test Person class
        Person person = new Person("John", "Doe", "Male");
        System.out.println("Person: " + person);

        // Test Teacher class
        String[] teacherCourses = {"Mathematics", "Physics"};
        Teacher teacher = new Teacher("Alice", "Smith", "Female", "Science", teacherCourses);
        System.out.println("Teacher: " + teacher);

        // Test Student class
        Student student = new Student("Emma", "Johnson", "Female", 123456);
        System.out.println("Student: " + student);

        // Test PhdStudent class
        String[] phdStudentCourses = {"Advanced Mathematics", "Quantum Physics"};
        PhdStudent phdStudent = new PhdStudent("Bob", "Brown", "Male", 789012, "Engineering", phdStudentCourses);
        System.out.println("PhdStudent: " + phdStudent);

        // Test equals() method
        System.out.println("\nTesting equals() method:");
        Person person2 = new Person("John", "Doe", "Male");
        System.out.println("person1 equals person2: " + person.equals(person2));

        Teacher teacher2 = new Teacher("Alice", "Smith", "Female", "Science", teacherCourses);
        System.out.println("teacher equals teacher2: " + teacher.equals(teacher2));

        Student student2 = new Student("Emma", "Johnson", "Female", 123456);
        System.out.println("student equals student2: " + student.equals(student2));

        PhdStudent phdStudent2 = new PhdStudent("Bob", "Brown", "Male", 789012, "Engineering", phdStudentCourses);
        System.out.println("phdStudent equals phdStudent2: " + phdStudent.equals(phdStudent2));
    }
}