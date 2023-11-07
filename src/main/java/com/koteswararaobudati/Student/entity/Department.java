package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(
        name = "department"
)
public class Department {
    @Id
    @SequenceGenerator(
            name = "department_sequence",
            sequenceName = "department_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "department_sequence"
    )
    @Column(
            name = "department_id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "department_name",
            nullable = false,
            columnDefinition = "VARCHAR(50)"
    )
    private String name;

    @OneToOne(
            cascade = CascadeType.PERSIST
    )
    @JoinColumns({
            @JoinColumn(
                    name = "department_head",
                    referencedColumnName = "faculty_id"
            )
    })
    private Faculty departmentHead;

    @OneToMany(
            mappedBy = "department",
            fetch = FetchType.EAGER
    )
    private List<Course> courses;

    @OneToMany(
            mappedBy = "department",
            fetch = FetchType.LAZY
    )
    private List<Faculty> faculties;

    @OneToOne(
            mappedBy = "department",
            fetch = FetchType.LAZY
    )
    private Student student;
}
