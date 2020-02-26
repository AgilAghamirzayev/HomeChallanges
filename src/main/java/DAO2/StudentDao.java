package DAO2;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudents(int rollNo);
    public void updateStudent(String student);
    public void deleteStudnet(Student student);

    void updateStudent(Student student);
}
