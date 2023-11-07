package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.FacultyPayment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacultyPaymentRepositoryTest {

    private final FacultyPayment facultyPayment;

    @Autowired
    public FacultyPaymentRepositoryTest(FacultyPayment facultyPayment) {
        this.facultyPayment = facultyPayment;
    }

    @Test
    public void deleteFaultyPayment(){
    }
}