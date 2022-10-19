package Övning3;

import java.util.ArrayList;

public class Kurs {

    double kursLängd;
    int kursPoäng;
    int studenter;
    Lärare lärare;

    ArrayList<Student> studentList = new ArrayList<Student>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public Student removeStudent(Student student){
        studentList.remove(student);
        return student;
    }

    public double getKursLängd() {
        return kursLängd;
    }

    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public int getKursPoäng() {
        return kursPoäng;
    }

    public int getStudenter() {
        return studenter;
    }

    public Kurs(double kursLängd, int kursPoäng, int studenter) {
        this.kursLängd = kursLängd;
        this.kursPoäng = kursPoäng;
        this.studenter = studenter;
    }
}

