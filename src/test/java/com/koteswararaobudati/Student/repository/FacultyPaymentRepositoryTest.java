package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.FacultyPayment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FacultyPaymentRepositoryTest {

    private final FacultyPaymentRepository facultyPaymentRepository;

    @Autowired
    public FacultyPaymentRepositoryTest(FacultyPaymentRepository facultyPaymentRepository) {
        this.facultyPaymentRepository = facultyPaymentRepository;
    }

    @Test
    public void getFacultyPayment(){
        FacultyPayment facultyPayment1 = FacultyPayment.builder()
                .accountNumber(123344)
                .routingNumber(132323)
                .paymentAddress("hhhh")
                .build();

        this.facultyPaymentRepository.save(facultyPayment1);
    }

    @Test
    public void deleteFacultyPayment(){
        this.facultyPaymentRepository.deleteById(3L);
    }
}