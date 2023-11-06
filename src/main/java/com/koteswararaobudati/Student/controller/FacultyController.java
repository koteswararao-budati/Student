package com.koteswararaobudati.Student.controller;

//import com.koteswararaobudati.Student.service.FacultyService;
import com.koteswararaobudati.Student.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/Faculty/")
//public class FacultyController {
//
//    // this method is not recommended because it causes nullable problems, and it is not final
////    @Autowired
////    private FacultyService facultyService;
//    private final FacultyService facultyService;
//
//    @Autowired
//    public FacultyController(FacultyService facultyService) {
//        this.facultyService = facultyService;
//    }
//
//    @PostMapping("registerFaculty/")
//    public void registerFaculty(@RequestBody Faculty faculty){
//        facultyService.addFaculty(faculty);
//    }
//}
