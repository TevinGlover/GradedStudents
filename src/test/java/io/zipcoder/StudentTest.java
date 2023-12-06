package io.zipcoder;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    ArrayList<Double> examScores;
    String firstName;
    String lastName;
    Student student;
    @Before
    public void setup(){
    student =new Student(firstName,lastName,examScores);
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
        student.setFirstName("max");
        String actual= student.getFirstName();
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

       Double[] actual= student.getExamScores(examScores);
        Double[] expect ={100.0,95.0,123.0,96.0};
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresAddTest(){
       examScores.add(110.0);
        Double[] expect ={100.0,95.0,123.0,96.0,110.0};
        Double[]  actual= student.getExamScores(examScores);
        Assert.assertEquals(expect,actual);
    }


    @Test
    public void studentExamScoresRemoveTest(){


        examScores.remove(3);
        Double[] expect ={100.0,95.0,123.0};
        Double[]  actual=student.getExamScores(examScores);
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresgetNumberOfExamsTaken(){

    Integer expect =4;
    Integer actual= student.getNumberOfExamsTaken(examScores);
    Assert.assertEquals(expect,actual);
    }

    @Test
    public void studentExamScoresSetExamScoreTest(){

        Integer examSpot = 1;
        Double score = 250.0;
        student.getExamsTest(examScores,examSpot,score);
        Double[] expect ={100.0,250.0,123.0,96.0};
        Double[] actual=  student.getExamsTest(examScores,examSpot,score);
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void studentExamScoresAverageTest(){


        Double expect = 103.5;
        Double  actual= student.averageExamScore(examScores, examScores.size());
        Assert.assertEquals(expect,actual);
    }


    @Test
    public void studentExamScoresAverageIFScoreIsZeroTest(){
        Integer examSpot3 = 3;
        Double score3 = - 50.0;
        student.getExamsTest(examScores,examSpot3,score3);
        Integer examSpot2 = 2;
        Double score2 =  -5.0;
        student.getExamsTest(examScores,examSpot2,score2);
        Integer examSpot1 = 1;
        Double score1 = -60.0;
        student.getExamsTest(examScores,examSpot1,score1);
        Integer examSpot0 = 0;
        Double score = 0.0;
        student.getExamsTest(examScores,examSpot0,score);
        Double expect = 0.0;
        Double  actual= student.averageExamScore(examScores, examScores.size());
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void studentExamScoresAverageIFScoreIsLessThenZeroTest(){
        Integer examSpot3 = 3;
        Double score = 0.0;
        student.getExamsTest(examScores,examSpot3,score);
        Integer examSpot2 = 2;
        Double score1 = 0.0;
        student.getExamsTest(examScores,examSpot2,score1);
        Integer examSpot1 = 1;
        Double score2 = 0.0;
        student.getExamsTest(examScores,examSpot1,score2);
        Integer examSpot0 = 0;
        Double score3 = 0.0;
        student.getExamsTest(examScores,examSpot0,score3);
        Double expect = 0.0;
        Double  actual= student.averageExamScore(examScores, examScores.size());
        Assert.assertEquals(expect,actual);
    }

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

