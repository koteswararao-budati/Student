package com.koteswararaobudati.Student.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverrides({
        @AttributeOverride(
                name = "first_name",
                column = @Column(name = "guardian_first_name")
        ),
        @AttributeOverride(
                name = "last_name",
                column = @Column(name = "guardian_last_name")
        ),
        @AttributeOverride(
                name = "email",
                column = @Column(name = "guardian_email")
        ),
        @AttributeOverride(
                name = "phoneNumber",
                column = @Column(name = "guardian_phone_number")
        )
})
public class Guardian {
    private String first_name;
    private String last_name;
    private String email;
    private String phoneNumber;
}
