package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(
        name = "course_material"
)
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
            name = "course_material_url",
            columnDefinition = "VARCHAR(255)"
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
            name = "course_id",
            referencedColumnName = "course_id"
    )
    private Course course;
}
