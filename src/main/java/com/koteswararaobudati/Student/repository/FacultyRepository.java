package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.Faculty;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    //The Optional transform into the below query in sql
//    @Query("SELECT f FROM Faculty f WHERE f.email=?1")
    Optional<Faculty> findFaultyByEmail(String email);

    Optional<Faculty> findFacultiesByFacultyId(Long id);

    @Query("SELECT f.firstName, f.lastName FROM Faculty f WHERE f.facultyId=?1")
    Optional<String[]> getFacultyFirstNameAndLastNameById(Long id);

    // you can implement transactions in service layer where all the transaction will not be committed until the entire service function block is executed
    @Transactional
    @Query("SELECT f.firstName FROM Faculty f WHERE f.email=?1 AND f.lastName=?2")
    Optional<String> findFirstNameByFacultyEmailAndFacultyLastName(String email, String lastName);
}
