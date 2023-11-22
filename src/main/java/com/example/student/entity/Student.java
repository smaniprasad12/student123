package com.example.student.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String name;
         int age;
        private double salary;
     
        // Constructors, getters, setters
        
        public Student() {
        }
        
        public Student(int id, String name, int age, double salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
     
        // Getters and setters...
     
        public int getId() {
            return id;
        }
     
        public void setId(int id) {
            this.id = id;
        }
     
        public String getName() {
            return name;
        }
     
        public void setName(String name) {
            this.name = name;
        }
     
        public int getAge() {
            return age;
        }
     
        public void setAge(int age) {
            this.age = age;
        }
     
        public double getSalary() {
            return salary;
        }
     
        public void setSalary(double salary) {
            this.salary = salary;
        }
     
        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
        }
    
    
}
