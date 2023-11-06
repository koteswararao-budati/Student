package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class FacultyPayment {

    @Id
    @SequenceGenerator(
            name = "faculty_payment_generator",
            sequenceName= "faculty_payment_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "faculty_payment_generator"
    )
    private Long facultyPaymentId;
    private int accountNumber;
    private int routingNumber;
    private String address;

    @OneToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.PERSIST
    )
    @JoinColumn(
            referencedColumnName = "faculty_id"
    )
    private Faculty faculty;
}
