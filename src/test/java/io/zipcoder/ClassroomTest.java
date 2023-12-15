package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ClassroomTest {
//    Classroom classroom;
//    Student student0;
//    ArrayList<Double> examScores;
//    Student student1;
//    ArrayList<Double> examScores1;
//    Student student2;
//    ArrayList<Double> examScores2;
//    Student student3;
//    ArrayList<Double> examScores3;
//    Student[] studentsArray;
//    @Before
//    public void setup(){
//    examScores3 = new ArrayList<>();
//    examScores2 = new ArrayList<>();
//    examScores1 = new ArrayList<>();
//    examScores = new ArrayList<>();
//    examScores3.add(100.0); examScores3.add(100.0); examScores3.add(100.0);examScores3.add(100.0);
//    examScores2.add(0.0); examScores2.add(60.0); examScores2.add(90.0);examScores2.add(0.0);
//    examScores1.add(190.0); examScores1.add(80.0); examScores1.add(-60.0);examScores1.add(0.0);
//    examScores.add(100.0); examScores.add(200.0); examScores.add(90.0);examScores.add(0.0);
//
//    student0 = new Student("alix","beckon", examScores);
//    student1 = new Student("bob","Sellyby", examScores1);
//    student2 = new Student("Chad","Ford", examScores2);
//    student3 = new Student("Sofie","Laranton", examScores3);
//    studentsArray = new Student[]{student0, student1, student2, student3};
//
//    classroom = new Classroom(studentsArray);
//
//
//    }

@Test
public void classNullaryConstructorTest() {
    Classroom classroom = new Classroom();

    Assert.assertNotNull(classroom);

}
    @Test
    public void classStudentArrayConstructorTest() {
    Student[] student = new Student[30];

        Classroom classroom = new Classroom(student);

        Assert.assertNotNull(classroom);

    }

    @Test
    public void classIntConstructorTest() {
     int maxStudent = 5;
        Classroom classroom = new Classroom( maxStudent);

        Assert.assertNotNull(classroom);
    }
    @Test
    public void getStudenttest(){
        ArrayList<Double> examScores2 = null;
        ArrayList<Double> examScores1 = null;
        examScores2.add(100.0); examScores2.add(180.0); examScores2.add(60.0);examScores2.add(0.0);
        examScores1.add(190.0); examScores1.add(80.0); examScores1.add(-60.0);examScores1.add(0.0);
    Student student1 = new Student("timlee", "glee", examScores2 );
        Student student = new Student("tim", "flee", examScores1 );
         Student[] students = new Student[]{student,student1};
        Classroom classroom = new Classroom(students);
        Student expected = student;
        Student actual = classroom.getStudent(student);
        Assert.assertEquals(actual, expected);
    }

//    @Test
//    public void classSizeTest() {
//        int expected = studentsArray.length;
//        int actual =  Classroom.getClassSize();
//
//        Assert.assertEquals(actual, expected);
//
//    }
//    @Test
//    public void setStudentsArrayTest() {
//
//        Assert.assertNotNull(studentsArray);
//
//    }

}