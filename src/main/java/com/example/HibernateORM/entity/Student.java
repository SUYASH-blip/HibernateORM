package com.example.HibernateORM.entity;

import jakarta.persistence.*;

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

        public Student(){}

        public Student(String name, String email, int age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }



