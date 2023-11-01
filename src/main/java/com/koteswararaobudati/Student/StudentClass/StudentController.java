package com.koteswararaobudati.Student.StudentClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @PostMapping("/registerStudent")
    public void registerStudent(@RequestBody Student student){
        this.studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        this.studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "/{studentId}")
    public void updateStudent(@PathVariable("studentId") long studentId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email){
        this.studentService.updateStudent(studentId, name, email);
    }
}
