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
    @Test
    public void getStudentsExamAveragesTest(){
        ArrayList<Double> examScores2 = new ArrayList<>();
        ArrayList<Double> examScores1 = new ArrayList<>();
        examScores2.add(100.0); examScores2.add(180.0); examScores2.add(60.0);examScores2.add(0.0);
        examScores1.add(190.0); examScores1.add(80.0); examScores1.add(-60.0);examScores1.add(0.0);
        Student student1 = new Student("timlee", "glee", examScores2 );
        Student student = new Student("tim", "flee", examScores1 );
        Student[] students = new Student[]{student,student1};
        Classroom classroom = new Classroom(students);

        // add all number in both arrays and dived by the amount.

        Double expected = 68.75;
        Double actual = classroom.getStudentsExamAverages();
        Assert.assertEquals( expected,actual);
    }

    @Test
    public void addStudentTest() {
        ArrayList<Double> examScores3 = new ArrayList<>();
        int maxNumberOfStudents = 30;
        examScores3.add(150.0);
        examScores3.add(120.0);
        examScores3.add(120.0);
        examScores3.add(125.0);

        Student studentNew = new Student("pim", "lee", examScores3);
        Student[] studentsImTheClass = new Student[maxNumberOfStudents];
        Classroom classroom = new Classroom(studentsImTheClass);


        classroom.addStudent(studentNew);
        int expected = 1;
        int actual = classroom.currentClassSize();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void classSizeTest() {
        Classroom classroom= new Classroom();

        int expected = 0;
        int actual =  classroom.currentClassSize();

        Assert.assertNotNull(classroom);
        Assert.assertEquals(actual, expected);

    }

  /** Define method removeStudent(String firstName, String lastName)
    The class Classroom should define a method which uses a firstName and lastName parameter to identify and remove the respective student from composite students object.
    Ensure the array is re-ordered after the removal; Null values should be located in the final indices of the array.
**/

  @Test
    public void removeStudentTest(){

  }



/**    Define method getStudentsByScore()
  The class Classroom should define a method getStudentsByScore() which returns an array representation of Student objects sorted in descending order by score.
    If two students have the same class average, order them lexigraphically.
**/

//@Test
//public void getStudentsByScoreTest(){
//
//}

/**    Define method getGradeBook()
    The class Classroom should define a method getGradeBook() which returns a mapping of Student objects to a respective letter grade determined by creating a grading curve such that
    An A is awarded to students whose class average is in the upper 10th percentile.
    A B is awarded to students whose class average falls between the upper 11th and 29th percentile.
    A C is awarded to students whose class average falls between the upper 30th and 50th percentile.
    A D is awarded to students whose class average falls between the lower 51st and 89th percentile.
    An F is awarded to students whose class average is in the lower 11th percentile.
**/
//@Test
//public void getGradeBookTest(){
//
//}
 }