package com.skaaria.task4;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        Student[] students = new Student[24];
        for (int c = 0;c<students.length; c++){
            students[c]= new Student(RandString.method(),RandString.method(),rand.nextInt(30),rand.nextInt(5),Math.random()*10);
        }
        Set<Student> studentsTreeSet = new TreeSet<>();
        for(Student x: students) studentsTreeSet.add(x);

        int count = 0;
        for (Student element : studentsTreeSet){
            if (count % 2 == 0){
                System.out.println(element);
            }
            count++;
        }
    }
}
