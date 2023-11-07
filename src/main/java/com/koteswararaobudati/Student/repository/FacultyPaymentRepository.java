package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.FacultyPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyPaymentRepository extends JpaRepository<FacultyPayment, Long> {

}
