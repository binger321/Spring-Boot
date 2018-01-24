package com.zby.ssmspringboot2.controller;

import com.zby.ssmspringboot2.domain.Student;
import com.zby.ssmspringboot2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 2017/11/23 0023
 * Time: 13:54
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/selectStudentByPrimaryKey",method = {RequestMethod.GET,RequestMethod.POST})
    public String selectStudentByPrimaryKey(HttpServletRequest request,Model model){
        if (request.getParameter("studentId")==null){
            return "error";
        }
        Integer studentId=Integer.parseInt(request.getParameter("studentId"));
        Student student=studentService.getUserByPrimaryKey(studentId);
        model.addAttribute("student",student);
        return student.toString();
    }

    @RequestMapping(value = "/listStudent",method = {RequestMethod.GET,RequestMethod.POST})
    public String listStudent(HttpServletRequest request,Model model){
        Student student=new Student();
        Integer studentId=null;
        String studentName;
        Integer phoneNumber=null;
        String address;
        Integer age=null;
        studentName=request.getParameter("studentName");
        student.setStudentName(studentName);
        address=request.getParameter("address");
        student.setAddress(address);
        if (request.getParameter("studentId")!=null){
            studentId=Integer.parseInt(request.getParameter("studentId"));
            student.setStudentId(studentId);
        }
        if (request.getParameter("phoneNumber")!=null){
            phoneNumber=Integer.parseInt(request.getParameter("phoneNumber"));
            student.setPhoneNumber(phoneNumber);
        }
        if (request.getParameter("age")!=null){
            age=Integer.parseInt(request.getParameter("age"));
            student.setAge(age);
        }
        if (studentName==null&&phoneNumber==null&&address==null&&age==null){
            return "/error";
        }
        List<Student> studentList=studentService.listStudent(student);
        model.addAttribute("studentList",studentList);
        StringBuilder sb=new StringBuilder();
        for (Student s:
             studentList) {
            sb.append(s.toString());
        }
        return sb.toString();
    }

    @RequestMapping(value = "/insert",method = {RequestMethod.GET,RequestMethod.POST})
    public String insert(@RequestParam(required = true) String studentName, @RequestParam(required = true) Integer phoneNumber, @RequestParam(required = false) String address,
                         @RequestParam(required = false) Integer age){
        Student student = new Student();
        student.setStudentName(studentName);
        student.setAddress(address);
        student.setPhoneNumber(phoneNumber);
        String result=studentService.insert(student)+"";
        System.out.println(studentName);
        return result;
    }

    @RequestMapping(value = "/delete",method = {RequestMethod.GET,RequestMethod.POST})
    public String delete(HttpServletRequest request,Model model){
        if (request.getParameter("studentId")==null){
            return "error";
        }
        Integer studentId=Integer.parseInt(request.getParameter("studentId"));
        Student student=new Student();
        student.setStudentId(studentId);
        String result=studentService.delete(student)+"";
        model.addAttribute("result",result);
        return result;
    }

    @RequestMapping(value = "/update",method = {RequestMethod.GET,RequestMethod.POST})
    public String update(HttpServletRequest request,Model model){
        Student student=new Student();
        Integer studentId=null;
        String studentName;
        Integer phoneNumber=null;
        String address;
        Integer age=null;
        studentName=request.getParameter("studentName");
        student.setStudentName(studentName);
        address=request.getParameter("address");
        student.setAddress(address);
        if (request.getParameter("studentId")!=null){
            studentId=Integer.parseInt(request.getParameter("studentId"));
            student.setStudentId(studentId);
        }
        if (request.getParameter("phoneNumber")!=null){
            phoneNumber=Integer.parseInt(request.getParameter("phoneNumber"));
            student.setPhoneNumber(phoneNumber);
        }
        if (request.getParameter("age")!=null){
            age=Integer.parseInt(request.getParameter("age"));
            student.setAge(age);
        }
        if (studentName==null&&phoneNumber==null&&address==null&&age==null){
            return "/error";
        }
        String result=studentService.update(student)+"";
        return result;
    }

}