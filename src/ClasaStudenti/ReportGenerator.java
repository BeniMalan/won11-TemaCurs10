package ClasaStudenti;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ReportGenerator {
    private List<StudentGrade> myListOfStudentsGrades;

    public ReportGenerator(List<StudentGrade> myListOfStudentsGrades) {
        this.myListOfStudentsGrades = myListOfStudentsGrades;
    }

    public static void generateReport(List<StudentGrade> students) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("Files/grade-reports.out"));

        Clasroom classroom = new Clasroom(students);

        // Find the student with the highest grade
        StudentGrade maxGrade = classroom.getMaxGrade2();

        // Find the student with the lowest grade
        StudentGrade minGrade = classroom.getWorstGrade(maxGrade.getDiscipline());

        // Calculate the average grade
        int averageGrade = classroom.getAverageGrade(maxGrade.getDiscipline());

        // Write the report to the file
        writer.write("Cea mai mare nota: " + maxGrade + "\n");
        writer.write("Nota medie: " + averageGrade + "\n");
        writer.write("Cea mai mica nota: " + minGrade + "\n");

        writer.close();
    }

}