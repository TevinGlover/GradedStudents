package io.zipcoder;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    ArrayList<Double> examScores;
    String fristName;
    String lastName;
    Student student;
    @Before
    public void setup(){
    student =new Student(fristName,lastName,examScores);
    examScores = new ArrayList<>();
     examScores.add(100.0);examScores.add(95.0);examScores.add(123.0);
     examScores.add(96.0);

    }

    @Test
    public void studentConstructorTest(){


        Assert.assertNotNull(student);
    }
    @Test
    public void studentFirstNameTest(){
        student.setFristName("max");
        String actual= student.getFristName();
        String expect ="max";
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void studentLastNameTest(){
        student.setLastName("benie");
        String actual= student.getLastName();
        String expect ="benie";
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresTest(){

       Double[] actual= student.getexamScores(examScores);
        Double[] expect ={100.0,95.0,123.0,96.0};
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresAddTest(){
       examScores.add(110.0);
        Double[] expect ={100.0,95.0,123.0,96.0,110.0};
        Double[]  actual= student.getexamScores(examScores);
        Assert.assertEquals(expect,actual);
    }


    @Test
    public void studentExamScoresRemoveTest(){


        examScores.remove(3);
        Double[] expect ={100.0,95.0,123.0};
        Double[]  actual=student.getexamScores(examScores);
        Assert.assertEquals(expect,actual);
    }
//    @Test
//    public void studentExamScoresgetNumberOfExamsTaken(){
//
//    Integer expect =4;
//    Integer actual= student.examScores.getNumberOfExamsTaken();
//    Assert.assertEquals(expect,actual);
//    }
//    @Test
//    public void studentExamScoresSetExamScoreTest(){
//
//        Integer examSpot = 2;
//        Double score = 250.0;
//        student.examScores.getExamsTest(examSpot,score);
//        Double[] expect ={100.0,250.0,123.0,96.0};
//        Double[] actual= student.getexamScores(examScores);
//        Assert.assertEquals(expect,actual);
//    }
//
//    @Test
//    public void studentExamScoresAverageTest(){
//
//
//
//        Double expect = 100.0;
//        Double  actual= AverageExamScore(student.examScores);
//        Assert.assertEquals(expect,actual);
//    }
//
//    @Test
//    public void studentToStringTest(){
//
//
//
//        String expect = Student" Name: " + student.fristName  + "\n" +
//		"> Average Score: " +student.examScores.getAverageExamScore() + "\n"+
//               " > Exam Scores:" + "\n" +
//        "Exam 1 -> " + student.examScores.postion(1) + "\n" +
//        "Exam 2 -> " + student.examScores.postion(2) + "\n" +
//        "Exam 3 -> " + student.examScores.postion(3) + "\n" +
//        "Exam 4-> " + student.examScores.postion(4);
//       String  actual= student.toString();
//        Assert.assertEquals(expect,actual);
//    }
//

}

