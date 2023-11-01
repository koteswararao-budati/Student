package com.koteswararaobudati.Student.Faculty;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table
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

    private LocalDate joined;

    public Faculty() {
    }

    public Faculty(String firstName, String middleName, String lastName, String email, LocalDate dob) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.joined = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getJoined() {
        return joined;
    }

    public void setJoined(LocalDate joined) {
        this.joined = joined;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", joined=" + joined +
                '}';
    }
}
