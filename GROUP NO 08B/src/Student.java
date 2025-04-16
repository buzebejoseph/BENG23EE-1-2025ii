public class Student {
    String Name;
    String course;
    String gender;
    Program(String Name, String course, String gender){
        this.Name = Name;
        this.course = course;
        this.gender = gender;
    }
    void displayProgram(){
        System.out.println("Student Name: " + Name);
        System.out.println("Student course: " + course);
        System.out.println("Student gender: " + gender);
    }
}
