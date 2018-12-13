package com.skaaria.task4;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int age;
    private int cource;
    private double avgMark;

    public Student() {
    }

    public Student(String name, String surname, int age, int cource, double avgMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.cource = cource;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                cource == student.cource &&
                Double.compare(student.avgMark, avgMark) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, cource, avgMark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", cource=" + cource +
                ", avgMark=" + avgMark +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        if (this.age>o.age){
            return 1;
        }
        if (this.age == o.age){
            return 0;
        }
        else return -1;
    }
}
