package com.example.student.controller;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;

   @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
       return studentService.saveStudent(student);
   }
   @GetMapping("/All")
    public List<Student> GetAll(){
       return studentService.getAllStudents();
   }
   @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable int id){
       return  studentService.getStudentById(id);
   }
   @PutMapping("/{id}")
    public Student update(@PathVariable int id,@RequestBody Student student){
       return studentService.updateStudent(id,student);
   }
   @DeleteMapping("/{id}")
    public String  delete(@PathVariable int id){
       return studentService.deleteStudent(id);
   }

}

