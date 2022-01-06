package com.example.demo;

import https.www_howtodoinjava_com.xml.school.Student;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by saeedi_m on 22/07/19.
 */
@Component
public class StudentRepository {

    private static final Map<String, Student> students = new HashMap<>();

    @PostConstruct
    public void initData() {

        Student student = new Student();
        student.setName("mahiii");
        student.setAge(28);
        student.setAddress("Galaxy far far away");
        students.put(student.getName(), student);

        student = new Student();
        student.setName("niloo");
        student.setAge(34);
        student.setAddress("Tehran, Iran");
        students.put(student.getName(), student);

        student = new Student();
        student.setName("Eunice");
        student.setAge(40);
        student.setAddress("Virginia");
        students.put(student.getName(), student);
    }

    public Student findStudent(String name) {
        Assert.notNull(name, "The Student's name must not be null");
        return students.get(name);
    }
}