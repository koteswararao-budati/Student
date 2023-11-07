package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
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
    @Column(
            name = "course_title",
            columnDefinition = "VARCHAR(50)",
            nullable = false
    )
    private String title;

    @Column(
            name = "course_credits",
            nullable = false
    )
    private Integer credits;

    @Column(
            name = "fees",
            columnDefinition = "INT"
    )
    private Short fees;

    @OneToOne(
//            mapped variable name
            mappedBy = "course"
    )
    private CourseMaterial courseMaterial;


    @ManyToMany(
            mappedBy = "courses"
    )
    private List<Faculty> faculties;

    @ManyToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.PERSIST,
            optional = false
    )
    @JoinColumn(
            name = "department",
            referencedColumnName = "department_id"
    )
    private Department department;
}
