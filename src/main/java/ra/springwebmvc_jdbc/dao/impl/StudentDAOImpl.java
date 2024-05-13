package ra.springwebmvc_jdbc.dao.impl;

import ra.springwebmvc_jdbc.dao.StudentDAO;
import ra.springwebmvc_jdbc.db.DBUtility;
import ra.springwebmvc_jdbc.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();

        Connection con;
        PreparedStatement pstmt;
        ResultSet rs;

        con = DBUtility.getConnection();
        try {
            pstmt = con.prepareStatement("select * from students");
            rs = pstmt.executeQuery();
            while(rs.next()){
                Student s = new Student();
                s.setStuId(rs.getLong("student_id"));
                s.setStuName(rs.getString("student_name"));
                s.setGender(rs.getBoolean("gender"));
                s.setBirthday(rs.getDate("birthday"));
                s.setAddress(rs.getString("address"));
                s.setClassName(rs.getString("class_name"));
                list.add(s);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtility.closeConnection(con);
        }

        return list;
    }

    @Override
    public Student getStudentById(Long stuId) {
        Student s = null;



        return s;
    }

    @Override
    public boolean insertStudent(Student stu) {
        return false;
    }
}
