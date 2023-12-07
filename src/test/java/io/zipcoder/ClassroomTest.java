package io.zipcoder;

import org.junit.Before;

import java.util.ArrayList;
import java.util.Collections;

public class ClassroomTest {
    Classroom classroom;
    Student student0;
    ArrayList<Double> examScores;
    Student student1;
    ArrayList<Double> examScores1;
    Student student2;
    ArrayList<Double> examScores2;
    Student student3;
    ArrayList<Double> examScores3;
    Student[] studentsArray;
    @Before
    public void setup(){
    examScores3.add(100.0); examScores3.add(100.0); examScores3.add(100.0);examScores3.add(100.0);
    examScores2.add(0.0); examScores2.add(60.0); examScores2.add(90.0);examScores2.add(0.0);
    examScores1.add(190.0); examScores1.add(80.0); examScores1.add(-60.0);examScores1.add(0.0);
    examScores.add(100.0); examScores.add(200.0); examScores.add(90.0);examScores.add(0.0);
    examScores3 = new ArrayList<>();
    examScores2 = new ArrayList<>();
    examScores1 = new ArrayList<>();
    examScores = new ArrayList<>();
    student0 = new Student("alix","beckon", examScores);
    student1 = new Student("bob","Sellyby", examScores1);
    student2 = new Student("Chad","Ford", examScores2);
    student3 = new Student("Sofie","Laranton", examScores3);
    studentsArray = new Student[]{student0, student1, student2, student3};

    classroom = new Classroom(studentsArray);
    }
}
