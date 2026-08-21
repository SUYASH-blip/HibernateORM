package com.example.HibernateORM.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "Student_Name",
            unique = true,
            length = 100,
            nullable = false,
            insertable = true,
            updatable = true
    )
    private String name;

    @Column(
            name = "Student_email",
            unique = true,
            nullable = false
    )
    private String email;


    @Column(
            name = "Student_Age",
            unique = false,
            nullable = false,
            length = 100
    )
    private int age;

    @Column(precision = 5, scale = 2)
    private BigDecimal percentage;

    private LocalDate dateOfBirth;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private StudentStatus status;

    @Transient
    private int marks;

    @Convert(converter = BooleanToStringConverter.class)
    private Boolean isMonitor;

    @Embedded
    @AttributeOverride(
            name = "pinCode",
            column = @Column(name = "current_PinCode")
    )
    @AttributeOverride(
            name = "streetNo",
            column = @Column(name = "current_streetNo")
    )
    @AttributeOverride(
            name = "housenumber",
            column = @Column(name = "current_housenumber")
    )
    private Address currentaddress;

    @Embedded
    @AttributeOverride(
            name = "pinCode",
            column = @Column(name = "permanent_PinCode")
    )
    @AttributeOverride(
            name = "streetNo",
            column = @Column(name = "permanent_streetNo")
    )
    @AttributeOverride(
            name = "housenumber",
            column = @Column(name = "permanent_housenumber")
    )
    private Address permanentaddress;

    public Student() {
    }

    public Student(Long id, String name, String email, int age,
                   BigDecimal percentage, LocalDate dateOfBirth,
                   LocalDateTime createdAt, StudentStatus status,
                   int marks, Boolean isMonitor,
                   Address currentaddress, Address permanentaddress) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.percentage = percentage;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = createdAt;
        this.status = status;
        this.marks = marks;
        this.isMonitor = isMonitor;
        this.currentaddress = currentaddress;
        this.permanentaddress = permanentaddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Boolean getMonitor() {
        return isMonitor;
    }

    public void setMonitor(Boolean monitor) {
        isMonitor = monitor;
    }

    public Address getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(Address currentaddress) {
        this.currentaddress = currentaddress;
    }

    public Address getPermanentaddress() {
        return permanentaddress;
    }

    public void setPermanentaddress(Address permanentaddress) {
        this.permanentaddress = permanentaddress;
    }
}



