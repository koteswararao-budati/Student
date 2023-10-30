package com.koteswararaobudati.Student.StudentClass;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        LocalDate dob = LocalDate.of(1994, Month.DECEMBER, 22);
        return List.of(
                new Student(1L, "Koti", "koti@koti.com", dob, 22)
        );
    }
}
