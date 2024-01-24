package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void getStudentsTest(){
        ArrayList<Double> examScores2 = new ArrayList<>();
        ArrayList<Double> examScores1 = new ArrayList<>();
    Student student1 = new Student("timlee", "glee", examScores2 );
        Student student = new Student("tim", "flee", examScores1 );
        examScores2.add(100.0); examScores2.add(180.0); examScores2.add(60.0);examScores2.add(0.0);
        examScores1.add(190.0); examScores1.add(80.0); examScores1.add(-60.0);examScores1.add(0.0);
         Student[] studentsImTheClass = new Student[]{student,student1};
        Classroom classroom = new Classroom(studentsImTheClass);


//        String expected = Arrays.toString(studentsImTheClass);
        String expected = " Name: tim\n" +
                "> Average Score: 52.5\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  190.0\n" +
                "Exam 2 ->  80.0\n" +
                "Exam 3 ->  -60.0\n" +
                "Exam 4 ->  0.0 \n" +
                " Name: timlee\n" +
                "> Average Score: 85.0\n" +
                "> Exam Scores:\n" +
                "Exam 1 ->  100.0\n" +
                "Exam 2 ->  180.0\n" +
                "Exam 3 ->  60.0\n" +
                "Exam 4 ->  0.0 \n";
        String actual = classroom.getStudents();
        Assert.assertEquals(expected,actual);
    }
    public void getStudentsExamAveragesTest(){
        ArrayList<Double> examScores2 = null;
        ArrayList<Double> examScores1 = null;
        examScores2.add(100.0); examScores2.add(180.0); examScores2.add(60.0);examScores2.add(0.0);
        examScores1.add(190.0); examScores1.add(80.0); examScores1.add(-60.0);examScores1.add(0.0);
        Student student1 = new Student("timlee", "glee", examScores2 );
        Student student = new Student("tim", "flee", examScores1 );
        Student[] students = new Student[]{student,student1};
        Classroom classroom = new Classroom(students);

        // add all number in both arrays and dived by the amount.

        Double expected = 68.75;
        Double actual = classroom.getStudentsExamAverages();
        Assert.assertEquals(actual, expected);
    }

   // @Test
//    public void addStudentTest(){
//        ArrayList<Double> examScores3 = null;
//         int maxNumberOfStudents = 1;
//        examScores3.add(150.0); examScores3.add(120.0); examScores3.add(120.0);examScores3.add(125.0);
//
//        Student studentNew = new Student("pim", "lee", examScores3 );
//        Student[] studentsImTheClass = new Student[maxNumberOfStudents];
//        Classroom classroom = new Classroom(studentsImTheClass);
//
//
//        classroom.addStudent(studentNew);
//       String expected = studentNew.toString();
//        String actual = classroom.toString();
//        Assert.assertEquals(actual, expected);
//    }
//    public void getStudentExamAverageTest(){
//        ArrayList<Double> examScores2 = null;
//        ArrayList<Double> examScores1 = null;
//        examScores2.add(100.0); examScores2.add(180.0); examScores2.add(60.0);examScores2.add(0.0);
//        examScores1.add(190.0); examScores1.add(80.0); examScores1.add(-60.0);examScores1.add(0.0);
//        Student student1 = new Student("timlee", "glee", examScores2 );
//        Student student = new Student("tim", "flee", examScores1 );
//        Student[] students = new Student[]{student,student1};
//        Classroom classroom = new Classroom(students);
//
//
//        Double expected = student.averageExamScore(examScores1,examScores1.size());
//        Double actual = classroom.getStudentExamAverage();
//        Assert.assertEquals(actual, expected);
//    }
//    @Test
//    public void classSizeTest() {
//        int expected = studentsArray.length;
//        int actual =  Classroom.getClassSize();
//
//        Assert.assertEquals(actual, expected);
//
//    }
//

}