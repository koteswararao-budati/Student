package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class CourseMaterial {
    @Id
    @SequenceGenerator(
            name = "course_material_generator",
            sequenceName = "course_material_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_generator"
    )
    @Column(
            name = "course_material_id",
            updatable = false
    )
    private Long id;
    private String url;

    @OneToOne(
            cascade = CascadeType.ALL,
//          fetch=FetchType.LAZY : will exclude course from to string, you can do this by
//          using @toToString(exclude ="course") at courseMaterial class
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "course_id"
    )
    private Course course;
}
