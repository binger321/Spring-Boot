package com.zby.ssmspringboot2.service;

import com.zby.ssmspringboot2.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/23 0023
 * Time: 13:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public interface StudentService {
    Student getUserByPrimaryKey(Integer studentId);

    List<Student> listStudent(Student student);

    int insert(Student student);

    int delete(Student student);

    int update(Student student);
}