package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Optional<Faculty> findFaultyByEmail(String email);
}
