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


    public void setFristName(String fristName) {
        this.fristName =fristName;
    }

    public String getFristName() { return fristName;
    }

    public void setLastName(String lastName) {
        this.lastName =lastName;
    }


    public String getLastName() {return lastName;
    }


    public Double[] getexamScores(ArrayList<Double> examScores) {
       Double[] arrayOfScores = new Double[examScores.size()]; // create a new array of the same size of the array list
        //create a for loop to go through the arrList to add them to the new array
        // then add them to the last position in the array.
        // then return the new array.


    }
}
