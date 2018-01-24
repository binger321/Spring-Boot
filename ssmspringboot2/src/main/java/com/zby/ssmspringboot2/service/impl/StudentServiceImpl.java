package com.zby.ssmspringboot2.service.impl;

import com.zby.ssmspringboot2.dao.StudentMapper;
import com.zby.ssmspringboot2.domain.Student;
import com.zby.ssmspringboot2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/23 0023
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getUserByPrimaryKey(Integer studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Override
    public List<Student> listStudent(Student student) {
        return studentMapper.listStudent(student);
    }

    @Override
    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int delete(Student student) {
        return studentMapper.delete(student);
    }

    @Override
    public int update(Student student) {
        return studentMapper.update(student);
    }
}