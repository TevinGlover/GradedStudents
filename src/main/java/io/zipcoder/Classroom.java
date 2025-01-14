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
        for (int i = 0; i < this.studentsArray.length; i++) {
            if (this.studentsArray[i] != null) {
                s1 += this.studentsArray[i].toString() + " \n";
            }
        }
        return s1;
    }

    public Double getStudentsExamAverages() {
        //  i want to take the students in the class
        // and then make it loop through the student's grades
        // and add the grades to gather and have a counter to cont how many times it goose throw the
        // the loop. and then divied the sum by the amount of time it loops through.
//        return average;
        ArrayList<Double> classGrades = new ArrayList<Double>();
        int infoNum = 0; // the amount of test score in arrlist
        double total = 0;

        for (int i = 0; i < this.studentsArray.length; i++) {
            if (this.studentsArray[i] != null) {
                for (int j = 0; j < this.studentsArray[i].examScores.size(); j++) {
                    infoNum++;
                    total += this.studentsArray[i].examScores.get(j);
                    classGrades.add(this.studentsArray[i].examScores.get(j));

                }

//                System.out.println(total);
//                System.out.println(infoNum);
//                System.out.println(classGrades);
            }
        }
        Double classAverage = total / infoNum;
//        System.out.println(classAverage);
        return classAverage;
    }

    public void addStudent(Student studentNew) {
        // create a if and statement. if class is not full, add a student. if full return is not able to.
       if ( this.studentsArray.length <= 30){
           int studentPlacementInClass = this.studentsArray.length-1;
           this.studentsArray[studentPlacementInClass] = studentNew;
       }
    }

    public int currentClassSize() {
        int size = 0;
        for (int i = 0; i < this.studentsArray.length; i++) {
            if( this.studentsArray[i] != null){
                size++;
            }

        }return size;
    }

    public void removeStudent(String firstName, String lastName) {
        // i want to go through the array of students in a class
        // and find the string1 and 2 that match
        // then remove them from the list
        // add all the names back into the array resized.
    }
}
