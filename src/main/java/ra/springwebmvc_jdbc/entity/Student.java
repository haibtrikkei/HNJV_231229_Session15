package ra.springwebmvc_jdbc.entity;

import java.util.Date;

public class Student {
    private Long stuId;
    private String stuName;
    private Boolean gender;
    private Date birthday;
    private String address;
    private String className;

    public Student() {
    }

    public Student(Long stuId, String stuName, Boolean gender, Date birthday, String address, String className) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.className = className;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
