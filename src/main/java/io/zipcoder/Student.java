package io.zipcoder;

import java.util.ArrayList;

public class Student {
    ArrayList<Double> examScores;
    String fristName;
    String lastName;
   public Student(String fristName, String lastName, ArrayList<Double> examScores){
        this.examScores = examScores;
        this.lastName = lastName;
        this.fristName =fristName;
    }
}
