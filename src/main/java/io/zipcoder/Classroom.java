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
        int infoNum = 0;
        for (int i = 0; i < this.studentsArray.length ; i++) {
            if(this.studentsArray[i] != null ) {
                s1 += this.studentsArray[i].toString() + " \n";
            }
            }
        return s1 ;
    }

}