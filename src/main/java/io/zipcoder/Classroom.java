package io.zipcoder;

import java.util.ArrayList;
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
        for (int i = 0; i < this.studentsArray.length ; i++) {
            if(this.studentsArray[i] != null ) {
                s1 += this.studentsArray[i].toString() + " \n";
            }
            }
        return s1 ;
    }

    public Double getStudentsExamAverages() {
        ArrayList<Double> classGrades = new ArrayList<Double>();

        int infoNum = 0;
        for (int i = 0; i < this.studentsArray.length ; i++) {
            if (this.studentsArray[i] != null) {
                classGrades.add(this.studentsArray[i].examScores.get(i));
                infoNum++;
                System.out.println(classGrades);
            }
        }
        //  i want to take the students in the class
        // and then make it loop through the student's grades
        // and add the grades to gather and have a counter to cont how many times it goose throw the
        // the loop. and then divied the sum by the amount of time it loops through.
//        return average;
        return null;
    }
}