package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table
@Data
@ToString
@Builder
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
            name = "faculty_id",
            updatable = false,
            insertable = false
    )
    private Long facultyId;

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


    @ManyToMany(
            cascade = CascadeType.PERSIST
    )
    @JoinTable(
            name = "faculty_course_map",
            joinColumns = @JoinColumn(
                    name = "faculty_id",
                    referencedColumnName = "faculty_id"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "course_id",
                    referencedColumnName = "course_id"
            )
    )
    private List<Course> courses;

    @ManyToOne
    @JoinColumn(
            name = "department",
            referencedColumnName = "department_id"
    )
    private Department department;

    @Column(
            name = "joined"
    )
    private final LocalDate joined = LocalDate.now();

    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false,
            orphanRemoval = true
    )
    @JoinColumn(
            name = "faculty_payment"
    )
    private FacultyPayment facultyPayment;
}
