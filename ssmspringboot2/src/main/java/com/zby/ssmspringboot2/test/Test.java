package com.zby.ssmspringboot2.test;

import com.zby.ssmspringboot2.domain.Student;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/23 0023
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        String str="mathmatic a lot/plenty of # teacher much/plentys lots of # # a w w";
        String newStr=str.replaceAll("# ","");
        System.out.println(newStr);

        Student student=new Student();
        String name=null;
        student.setStudentName(name);
        System.out.println(student);
    }
}