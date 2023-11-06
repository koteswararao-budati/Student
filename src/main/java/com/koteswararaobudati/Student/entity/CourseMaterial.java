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
            updatable = false
    )
    private Long courseMaterialId;

    @Column(
            name = "course_material_url"
    )
    private String courseMaterialUrl;

    @OneToOne(
            cascade = CascadeType.ALL,
//          fetch=FetchType.LAZY : will exclude course from to string, you can do this by
//          using @toToString(exclude ="course") at courseMaterial class
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            referencedColumnName = "course_id"
    )
    private Course course;
}
