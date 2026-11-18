package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int marks;
    @OneToMany
    private List<Laptop> laptops;

    public void setRollNo(int rollNo) {
        this.rollNo =  rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setLaptop(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public List<Laptop> getLaptop() {
        return laptops;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", laptops=" + laptops +
                '}';
    }
}


