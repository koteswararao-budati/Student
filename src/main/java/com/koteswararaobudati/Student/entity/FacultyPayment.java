package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder
@Table(
        name = "faculty_payment"
)
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
    @Column(
            name = "faculty_payment_id",
            updatable = false
    )
    private Long facultyPaymentId;

    @Column(
            name = "account_number",
            nullable = false,
            columnDefinition = "INT"
    )
    private int accountNumber;

    @Column(
            name = "routing_number",
            nullable = false,
            columnDefinition = "INT"
    )
    private int routingNumber;

    @Column(
            name = "payment_address",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String paymentAddress;

    @OneToOne(
            fetch = FetchType.EAGER,
            cascade = CascadeType.PERSIST,
            mappedBy = "facultyPayment"
    )
    private Faculty faculty;
}
