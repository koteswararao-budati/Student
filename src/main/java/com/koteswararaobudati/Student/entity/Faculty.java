package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {
    @Id
    @SequenceGenerator(
            name = "Faculty-Sequence",
            sequenceName = "Faculty-Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Faculty-Sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String firstName;

    @Column(
            name = "middle_name",
            columnDefinition = "TEXT"
    )
    private String middleName;

    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String lastName;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;

    @Column(
            name = "dob",
            nullable = false
    )
    private LocalDate dob;

    @Column(
            name = "joined"
    )
    private final LocalDate joined = LocalDate.now();
}
