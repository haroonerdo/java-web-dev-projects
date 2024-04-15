import java.util.ArrayList;

public class Course {
private ArrayList<Student> enrolledStudents;
private Teacher instructor;
private String subject;

//constructor

    public Course(ArrayList<Student> enrolledStudents, Teacher instructor, String topic) {
        this.enrolledStudents = enrolledStudents;
        this.instructor = instructor;
        this.subject = topic;
    }


// add getter and setter

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public String getTopic() {
        return subject;
    }

    public void setTopic(String topic) {
        this.subject = topic;
    }
}
