package com.koteswararaobudati.Student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
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
    private Long studentPaymentId;
    private Integer totalFee;
    private Integer semesterFee;
    private Integer feePaid;
    private Integer balance;
    private String primaryPayment;
    private String primaryPaymentAddress;
    private String secondaryPayment;
    private String secondaryPaymentAddress;

    @OneToOne
    @JoinColumn(
            referencedColumnName = "student_id"
    )
    private Student student;
}
