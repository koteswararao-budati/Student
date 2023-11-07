package com.koteswararaobudati.Student.repository;

import com.koteswararaobudati.Student.entity.Course;
import com.koteswararaobudati.Student.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseMaterialRepositoryTest {

    private final CourseMaterialRepository courseMaterialRepository;

    @Autowired
    public CourseMaterialRepositoryTest(CourseMaterialRepository courseMaterialRepository) {
        this.courseMaterialRepository = courseMaterialRepository;
    }

/*
    @Test
    void postCourseMaterials() {
        Course course = Course
                .builder()
                .title("DTA")
                .credits(5)
                .build();

        CourseMaterial courseMaterial = CourseMaterial
                .builder()
                .url("DSA")
                .course(course)
                .build();

        this.courseMaterialRepository.save(courseMaterial);

    }
*/
}