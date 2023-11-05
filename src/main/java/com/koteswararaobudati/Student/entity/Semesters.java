package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Semesters {

    @Id
    @SequenceGenerator(
            name = "semester_id_sequence",
            sequenceName = "semester_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "semester_id_sequence"
    )
    @Column(
            name = "semester_id"
    )
    private int id;
    private short year;

    @OneToMany(
            cascade = CascadeType.PERSIST
    )
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "semester_id"
    )
    private List<Course> courses;
}
