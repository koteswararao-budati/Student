package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email"),
                @UniqueConstraint(name = "student_phone_number_unique", columnNames = "phone_number")
        }
)
public class Student {
    @Id
    @SequenceGenerator(
            name = "Student_sequence",
            sequenceName = "Student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Student_sequence"
    )
    @Column(
            name = "student_id",
            updatable = false)
    private long studentId;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String name;

    @Column(
            name = "email",
//            unique = true,
            nullable = false,
            columnDefinition = "varchar(200)"
    )
    private String email;

    @Column(
            name = "phone_number",
            nullable = false,
            columnDefinition = "INT"
    )
    private int phoneNumber;

    @Column(
            name = "dob",
            nullable = false
    )
    private LocalDate dob;

    @Transient
    private int age;

    @Column(
            name = "password",
            nullable = false,
            columnDefinition = "CHAR(25)"
    )
    private String password;

    @OneToMany(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.EAGER
    )
    @JoinColumn(
            name = "semester_id",
            referencedColumnName = "student_id"
    )
    private List<Semesters> semesters;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "student_payment_id",
            referencedColumnName = "student_payment_id"
    )
    private StudentPayment studentPayment;

    @Embedded
    private Guardian guardian;

    @OneToOne(
            cascade = CascadeType.PERSIST,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "department_id",
            referencedColumnName = "department_id"
    )
    private Department department;

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }
}
