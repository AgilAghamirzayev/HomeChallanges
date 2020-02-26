package DAO2;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {

    List<Student> students;

    public StudentDaoImp() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Aqil",0);
        Student student2 = new Student("Asgar",1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public void deleteStudnet(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student rollNo: " + student.getRollNo() + ", deleted from database");
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudents(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(String student) {

    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Studnet: roll no : " + student.getRollNo() + ", updated in the database");
    }
}
