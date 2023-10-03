package com.springinterceptor.controller;

import com.springinterceptor.interceptor.CheckHttpRequestFilter;
import com.springinterceptor.model.Student;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/student/")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    List<Student> list = new ArrayList<>();

    @GetMapping("test-server")
    public String test() {
        logger.info("Checking the server");
        return "Server is up. . . ";
    }

    @GetMapping("all-students")
    public List<Student> getAllStudent() {
        logger.info("in get all students method");
        return list;
    }

    @PostMapping("add-student")
    public List<Student> addStudent(@RequestBody Student student) {
        logger.info("in add student method");
        list.add(student);
        return list;
    }
}
