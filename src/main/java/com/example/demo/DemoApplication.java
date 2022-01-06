package com.example.demo;

import https.www_howtodoinjava_com.xml.school.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/greeting")
    public Student greeting(Student st) {
        st.setName("mahiii");
        st.setAge(28);
        st.setAddress("Galaxy far far away");
        return st;
    }
}