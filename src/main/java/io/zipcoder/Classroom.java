package io.zipcoder;

import java.util.Arrays;

public class Classroom {
    private Student[] studentsArray;

    public Classroom(Student[] studentsArray) { //student arrary constructor
        this.studentsArray = studentsArray;
    }


    public Classroom(int maxNumberOfStudents) { // int constructor
        this.studentsArray = new Student[maxNumberOfStudents];
    }

    public Classroom() {// nullary constructor
        this.studentsArray = new Student[30];
    }

    public String getStudents() {
        String s1 = "";
        for (Student s : Arrays.asList(studentsArray)) {
            assert s != null;
            s1 = s.toString() + " \n";

            }
        return s1 ;
    }

}