package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(
        name = "student_payment"
)
public class StudentPayment {
    @Id
    @SequenceGenerator(
            name = "student_payment_sequence",
            sequenceName= "student_payment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_payment_sequence"
    )
    @Column(
            name = "student_payment_id",
            updatable = false
    )
    private Long studentPaymentId;

    @Column(
            name = "total_fee",
            columnDefinition = "INT"
    )
    private Integer totalFee;

    @Column(
            name = "semester_fee",
            columnDefinition = "INT"
    )
    private Integer semesterFee;

    @Column(
            name = "fee_paid",
            columnDefinition = "INT"
    )
    private Integer feePaid;

    @Column(
            name = "student_payment_balance",
            columnDefinition = "INT"
    )
    private Integer studentPaymentBalance;


    @Column(
            name = "primary_payment",
            nullable = false,
            columnDefinition = "VARCHAR(100)"
    )
    private String primaryPayment;

    @Column(
            name = "primary_payment_address",
            nullable = false,
            columnDefinition = "VARCHAR(255)"
    )
    private String primaryPaymentAddress;

    @Column(
            name = "secondary_payment",
            columnDefinition = "VARCHAR(100)"
    )
    private String secondaryPayment;

    @Column(
            name = "secondary_payment_address",
            columnDefinition = "VARCHAR(255)"
    )
    private String secondaryPaymentAddress;

    @OneToOne(
            mappedBy = "studentPayment",
            cascade = CascadeType.PERSIST
    )
    private Student student;
}
