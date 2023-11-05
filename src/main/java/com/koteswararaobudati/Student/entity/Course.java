package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_id_generator",
            sequenceName = "course_id_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_id_generator"

    )
    @Column(
            name = "course_id",
            updatable = false
    )
    private Long courseId;
    private String title;
    private Integer credits;

    @OneToOne(
//            mapped variable name
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;

    @ManyToMany
    @JoinTable(
            name = "student_course_map",
            joinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "course_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "student_id"
            )
    )
    private List<Student> student;

    @OneToMany(
            mappedBy = "facultyId"
    )
    private List<Faculty> faculties;

    @ManyToOne(
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "department",
            referencedColumnName = "department_name"
    )
    private Department department;
}
