package ДЗ;

import model.Student;
import model.StudentGroupe;
import model.Teacher;
import view.ViewStudentGroupe;

import java.util.ArrayList;
import java.util.List;

import controller.Controller;

public class Main {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Новиков", "Иван" , "Васильевич", "1");
        List<Student> students = new ArrayList<>();

        students.add(new Student("Воробьев", "Игнат", "Борисович", "2"));
        students.add(new Student("Джамбиев", "Сергей", "Григорьевич", "3"));

        Controller controller = new Controller();

        StudentGroupe studentGroupe = controller.createStudentGroupe(teacher, students);

        
        ViewStudentGroupe viewStudentGroupe = new ViewStudentGroupe();
        viewStudentGroupe.view(studentGroupe);
    }
}