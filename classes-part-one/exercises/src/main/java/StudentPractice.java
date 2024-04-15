import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below

        Student student1 =new Student("Haroon", 1111, 1, 4.0);
        Student student2=new Student("Alex", 1112,1,3.8);
        Student student3=new Student("Mary", 1113,1,3.9);
        ArrayList<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // System.out.println(student1); // return: location in memory Student@251a69d7
        System.out.println("ID: "+student1.getStudentId()); // return: student ID
        System.out.println("Student Name: "+student1.getName()); // return student name
        System.out.println("Number of Credits: "+student1.getNumberOfCredits()); // return student name
        System.out.println("GPA: "+student1.getGpa()); // return student name
        System.out.println("\n");

        //I use setter any changing
        // Student ID is private, no change
        student1.setNumberOfCredits(2);

        for(Student student : students) {
            System.out.println("ID: "+student.getStudentId()+", Name: "+student.getName()+
                    ", Number of Credit: "+student.getNumberOfCredits()+", Student GPA: "+student.getGpa());
        }

        Teacher teacher1=new Teacher("Noor", "Kalem", "Physics", 25);
        Teacher teacher2=new Teacher("Jhon", "Sam", "History", 5);
        ArrayList<Teacher> teachers=new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        for(Teacher teacher : teachers) {
            System.out.println("Teacher Name: "+teacher.getfirstName()+" "+teacher.getLastName()+
                    ", \nSubject: "+teacher.getSubject()+", Teaching Years: "+teacher.getYearsTeaching());
        }





    }
}
