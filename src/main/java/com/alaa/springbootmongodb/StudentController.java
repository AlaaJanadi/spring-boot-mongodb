package com.alaa.springbootmongodb;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @GetMapping
    public List<Student> fetchAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping("{studentId}")
    public void deleteStudent(@PathVariable("studentId") String id){
        studentService.deleteStudent(id);
    }

    @PutMapping("{studentId}")
    public void updateStudent(@PathVariable("studentId") String id, @RequestBody Student newStudent){
        studentService.updateStudent(id,newStudent);
    }
}
