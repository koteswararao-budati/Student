package com.koteswararaobudati.Student.service;

import com.koteswararaobudati.Student.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
//public class FacultyService {
//    private final FacultyRepository facultyRepository;
//
//    @Autowired
//    public FacultyService(FacultyRepository facultyRepository) {
//        this.facultyRepository = facultyRepository;
//    }
//
//    public void addFaculty(Faculty faculty){
//        Optional<Faculty> facultyOptional = this.facultyRepository.findFaultyByEmail(faculty.getEmail());
//        if(facultyOptional.isPresent() || faculty.getEmail().isEmpty()){
//            throw new IllegalStateException("Email is Invalid. It already exists or it is empty");
//        } else if (faculty.getFirstName().isEmpty() || faculty.getLastName().isEmpty() ) {
//            throw new IllegalStateException("Name can't be empty");
//        }
//        this.facultyRepository.save(faculty);
//    }
//}
