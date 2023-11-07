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
            name = "semester_id",
            updatable = false
    )
    private int id;

    @Column(
            name = "year",
            nullable = false,
            columnDefinition = "INT"
    )
    private short year;

    @OneToMany(
            cascade = CascadeType.PERSIST
    )
    @JoinColumn(
            name = "semester_course",
            referencedColumnName = "semester_id"
    )
    private List<Course> courses;
}
