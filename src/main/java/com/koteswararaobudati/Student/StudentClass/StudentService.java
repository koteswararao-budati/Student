package com.koteswararaobudati.Student.StudentClass;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public void addStudent(Student student){
       Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
       if(studentOptional.isPresent()){
           throw new IllegalStateException("A student with email Exits");
       }

       studentRepository.save(student);
    }

    public void deleteStudent(Long studentId){
        boolean exits = studentRepository.existsById(studentId);

        if(!exits){
            throw new IllegalStateException("Student with id: " + studentId + " Does not exits");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(long studentId, String name, String  email){
        Student student = studentRepository.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("No Student with this Id exits"));

        if(name != null &&
                !name.isEmpty() &&
        !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }
        if(email!= null &&
                !email.isEmpty() &&
                !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("Email already Exits");
            }
            student.setEmail(email);
        }
    }
}
