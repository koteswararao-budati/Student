package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
