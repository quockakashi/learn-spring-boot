package com.quocnguyen.restcontrollerdemo.rest;

import com.quocnguyen.restcontrollerdemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllerDemo {

    private List<Student> students;

    @PostConstruct
    public void generateStudentsList() {
        students = new ArrayList<>();
        students.add(new Student("Anh", "Nguyen"));
        students.add(new Student("Hong", "Tran"));
        students.add(new Student("Ly", "Pham"));
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("students/{idStudent}")
    public Student getStudent(@PathVariable int idStudent) {
        if(idStudent < 0 || idStudent >= students.size()) {
            throw new StudentNotFoundException("Not found student at - " + idStudent);
        }
        return students.get(idStudent);
    }

    @ExceptionHandler
    public ResponseEntity<StudentExceptionResponse> handelException(StudentNotFoundException e) {
        var studentResponse = new StudentExceptionResponse();
        studentResponse.setStatus(HttpStatus.NOT_FOUND.value());
        studentResponse.setMessage(e.getMessage());
        studentResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(studentResponse, HttpStatus.NOT_FOUND);

    }
}

