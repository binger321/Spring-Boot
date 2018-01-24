package com.zby.ssmspringboot2.domain;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/23 0023
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Student {
    private Integer studentId;
    private String studentName;
    private Integer phoneNumber;
    private String address;
    private Integer age;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}