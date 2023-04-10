package ClasaStudenti;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<StudentGrade> myList = StudentGrade.readFromFile("Files/grades.txt");
            Clasroom clasroom = new Clasroom(myList);

            List<Integer> grades = clasroom.getGradesForDiscipline("Mathematics");
            List<Integer> grades2 = clasroom.getGradesForStudent("Gasparo");
            StudentGrade maxGrade = clasroom.getMaxGrade("Mathematics");
            StudentGrade maxGrade2 = clasroom.getMaxGrade2();
            int average = clasroom.getAverageGrade("Mathematics");
            StudentGrade minGrade = clasroom.getWorstGrade("Mathematics");
            for (StudentGrade student : myList) {
                System.out.println(student.getName() + " " + student.getDiscipline() + " " + student.getGrade());
            }
            System.out.println(grades);
            System.out.println(grades2);
            System.out.println(maxGrade.toString());
            System.out.println(maxGrade2.toString());
            System.out.println(average);
            System.out.println(minGrade.toString());
            ReportGenerator reportGenerator = new ReportGenerator(myList);
            ReportGenerator.generateReport(myList);
        } catch (IOException e) {
            System.out.println("An error occurred while generating the report: " + e.getMessage());
        }
    }
}