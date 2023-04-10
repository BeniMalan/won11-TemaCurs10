package ClasaStudenti;

import java.util.ArrayList;
import java.util.List;

public class Clasroom {
    private List<StudentGrade> myList;

    public Clasroom(List<StudentGrade> myList) {
        this.myList = myList;
    }

    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> listOfGrades = new ArrayList<>();
        for (StudentGrade Student : myList) {
            if (Student.getDiscipline().equals(discipline)) {
                listOfGrades.add(Student.getGrade());
            }

        }
        return listOfGrades;
    }

    public List<Integer> getGradesForStudent(String Student) {

        List<Integer> listOfGrades = new ArrayList<>();
        for (StudentGrade Students : myList) {
            if (Students.getName().equals(Student)) {
                listOfGrades.add(Students.getGrade());
            }
        }
        return listOfGrades;
    }

    public StudentGrade getMaxGrade(String discipline) {
        int max = 0;
        StudentGrade maxGrade = null;
        for (StudentGrade st : myList) {
            if (st.getDiscipline().equals(discipline) && st.getGrade() > max) {
                max = st.getGrade();
                maxGrade = st;

            }
        }

        return maxGrade;
    }

    public StudentGrade getMaxGrade2() {

        int max = 0;
        StudentGrade maxGrade = null;
        for (StudentGrade st : myList) {
            if (st.getGrade() > max) {
                max = st.getGrade();
                maxGrade = st;
            }
        }
        return maxGrade;
    }

    int getAverageGrade(String disciplina) {
        int sum = 0;
        int nr = 0;
        for (StudentGrade student : myList) {
            if (student.getDiscipline().equals(disciplina)) {
                sum = sum + student.getGrade();
                nr++;

            }

        }
        return  sum / nr;
    }
    StudentGrade getWorstGrade(String discipline){
        int min= Integer.MAX_VALUE;
        StudentGrade worstGrade=null;
        for(StudentGrade studentGrade:myList){
            if(studentGrade.getDiscipline().equals(discipline)&&studentGrade.getGrade()<min){
                min=studentGrade.getGrade();
                worstGrade=studentGrade;
            }

        }
        return worstGrade;
    }
}



