package ra.springwebmvc_jdbc.dao;

import ra.springwebmvc_jdbc.entity.Student;

import java.util.List;

public interface StudentDAO {
    public List<Student> getStudents();
    public Student getStudentById(Long stuId);
    public boolean insertStudent(Student stu);
}
