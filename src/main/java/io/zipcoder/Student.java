package io.zipcoder;

import java.util.ArrayList;

public class Student {
    ArrayList<Double> examScores;
    String firstName;
    String lastName;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.examScores = examScores;
        this.lastName = lastName;
        this.firstName = firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getLastName() {
        return lastName;
    }


    public Double[] getExamScores(ArrayList<Double> examScores) {
        Double[] arrayOfScores = new Double[examScores.size()]; // create a new array of the same size of the array list
        int j = 0;
        for (int i = 0; i <= examScores.size() - 1; i++) {//create a for loop to go through the arrList to add them to the new array
            arrayOfScores[j++] = examScores.get(i);// then add them to the last position in the array.
        }// then return the new array.
        return arrayOfScores;


    }

    public Integer getNumberOfExamsTaken(ArrayList<Double> examScores) {
        Integer amountOfExams = 0;
        // want to for each loop and count the number
        // of times it gose through the loop and return the count.
        for (Double score : examScores) {
            if (!(score == null)) {
                amountOfExams++;
            }

        }
        return amountOfExams;
    }

    public Double[] getExamsTest(ArrayList<Double> examScores, Integer examSpot, Double score) {
        examScores.set(examSpot, score); // i want to take a arraylist and then.
        Double[] arrayS = getExamScores(examScores);//replace a double with another score.
        return arrayS;  // then return it as a double[].
    }

}
