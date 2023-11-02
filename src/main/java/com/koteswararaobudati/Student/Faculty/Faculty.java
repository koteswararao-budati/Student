package com.koteswararaobudati.Student.Faculty;

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
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private LocalDate dob;

    private final LocalDate joined = LocalDate.now();
}
