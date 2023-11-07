package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.Faculty;
import com.koteswararaobudati.Student.entity.FacultyPayment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class FacultyRepositoryTest {
    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyRepositoryTest(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    @Test
    public void saveFaculty(){
        FacultyPayment facultyPayment = FacultyPayment.builder()
                .accountNumber(12344556)
                .routingNumber(24334343)
                .paymentAddress("123 north ave")
                .build();

        Faculty faculty = Faculty.builder()
                .firstName("ninkur")
                .lastName("bogi")
                .email("ninkur@bogi.com")
                .dob(LocalDate.of(1990, 2, 19))
                .facultyPayment(facultyPayment)
                .build();

        this.facultyRepository.save(faculty);
    }

    @Test
    public void deleteFaculty(){
        this.facultyRepository.deleteById(2L);
    }

}