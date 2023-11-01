package com.koteswararaobudati.Student.Faculty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    @Query("SELECT f FROM Faculty f WHERE f.email=?1")
    Optional<Faculty> findFaultyByEmail(String email);
}
