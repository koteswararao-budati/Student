package com.koteswararaobudati.Student.controller;

import com.koteswararaobudati.Student.service.FacultyService;
import com.koteswararaobudati.Student.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Faculty/")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;


    @PostMapping("registerFaculty/")
    public void registerFaculty(@RequestBody Faculty faculty){
        facultyService.addFaculty(faculty);
    }
}
