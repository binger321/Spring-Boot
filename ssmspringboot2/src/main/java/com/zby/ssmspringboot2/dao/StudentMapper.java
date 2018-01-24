package com.zby.ssmspringboot2.dao;

import com.zby.ssmspringboot2.domain.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/23 0023
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface StudentMapper {
    int insert(Student student);

    int delete(Student student);

    int update(Student student);

    Student selectByPrimaryKey(Integer id);

    List<Student> listStudent(Student student);
}
