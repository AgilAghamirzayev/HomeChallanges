package DAO2;

public class DaoPatternDemo {
    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImp();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [ Roll no " + student.getRollNo()+", Name : "+ student.getName() + "]" );
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Aysu");
        studentDao.getStudents(0);
        studentDao.updateStudent(student);

        studentDao.getStudents(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", name : " + student.getName()+"]");

        for (Student a : studentDao.getAllStudents()) {
            System.out.println("Student: [ Roll no " + a.getRollNo()+", Name : "+ a.getName() + "]" );
        }
    }
}
