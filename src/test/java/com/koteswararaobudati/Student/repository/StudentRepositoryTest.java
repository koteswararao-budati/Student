package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class StudentRepositoryTest {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentRepositoryTest(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Test
    public void saveStudent(){

        Student student = Student.builder()
                .name("koti budati")
                .phoneNumber(899999999)
                .dob(LocalDate.of(1994, 12, 22))
                .password("password")
                .email("kotibudati@gmail.com")
                .build();

        studentRepository.save(student);
    }
}