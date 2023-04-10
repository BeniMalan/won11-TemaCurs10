package ClasaStudenti;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGrade {
    private String name;
    private String discipline ;
    private int grade;


    public StudentGrade(String name, String discipline, int grade) {
        this.name = name;
        this.discipline = discipline;
        this.grade = grade;

    }


    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }
    public String toString() {
        return name + " " + discipline + " " + grade;
    }



    public static List<StudentGrade> readFromFile(String path) throws FileNotFoundException {
        List<StudentGrade> myList=new ArrayList<>();
        Scanner scanner=new Scanner(new File(path));
        while(scanner.hasNext()){
            String line= scanner.nextLine();
            String [] tokens=line.split("\\|");
            if(tokens.length<3)

            {
                System.out.println("Lipseste un string din  liniile fisirului!!adaugati stringul delimitat de regex");
                System.exit(0);
                }else
            myList.add(new StudentGrade(tokens[0].split(" ")[0], tokens[1], Integer.parseInt(tokens[2])));

        }
        scanner.close();
        return myList;
    }

}
