package io.zipcoder;

import com.sun.org.apache.bcel.internal.generic.NEW;
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
     fristName = "john";
     lastName = " Smith";
     examScores.add(100.0);examScores.add(95.0);examScores.add(123.0);
     examScores.add(96.0);

    }

    @Test
    public void studentConstructorTest(){


        Assert.assertNotNull(student);
    }
    @Test
    public void studentFirstNameTest(){

        String actual= student.getFristName();
        String expect ="john";
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void studentLastNameTest(){

        String actual= student.getLastName();
        String expect ="Smith";
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresTest(){

        String actual= student.getexamScore();
        double[] expect ={100.0,95.0,123.0,96.0};
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresAddTest(){
        student.examScore.add(110.0);
        double[] expect ={100.0,95.0,123.0,96.0,110.0};
        double[]  actual= Student.getexamScore();
        Assert.assertEquals(expect,actual);
    }


    @Test
    public void studentExamScoresRemoveTest(){


        student.examScore.remove(3);
        double[] expect ={100.0,95.0,123.0};
        double[]  actual= student.getexamScore();
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresgetNumberOfExamsTaken(){



    Integer expect =4;
       Integer  actual= student.getNumberOfExamsTaken();
        Assert.assertEquals(expect,actual);
    }
    @Test
    public void studentExamScoresSetExamScoreTest(){



        Double expect = 100.0;
        Double  actual= student.getExamsTest();
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void studentExamScoresAverageTest(){



        Double expect = 100.0;
        Double  actual= student.getAverageExamScore();
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void studentToStringTest(){



        String expect = Student" Name: " + student.fristName  + "\n" +
		"> Average Score: " +student.examScores.getAverageExamScore() + "\n"+
               " > Exam Scores:" + "\n" +
        "Exam 1 -> " + student.examScores.postion(1) + "\n" +
        "Exam 2 -> " + student.examScores.postion(2) + "\n" +
        "Exam 3 -> " + student.examScores.postion(3) + "\n" +
        "Exam 4-> " + student.examScores.postion(4);
       String  actual= student.toString();;
        Assert.assertEquals(expect,actual);
    }


}

