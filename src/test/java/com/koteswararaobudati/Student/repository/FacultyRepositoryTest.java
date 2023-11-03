package com.koteswararaobudati.Student.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FacultyRepositoryTest {
    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyRepositoryTest(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Test
    public void getFacultyById(){
        System.out.println(this.facultyRepository.findFacultiesById(1L));
    }

    @Test
    public void getFacultyFirstNameAndLastNameById(){
        System.out.println(this.facultyRepository.getFacultyFirstNameAndLastNameById(1L));
    }
}