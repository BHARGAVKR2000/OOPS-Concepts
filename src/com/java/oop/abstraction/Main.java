package com.java.oop.abstraction;

abstract class ScoreBoard{
    abstract int getRank();
}

class Student extends ScoreBoard{
    public String name;
    private int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
    int getRank(){
        return rank;
    }

}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("john",3);
        Student student1 = new Student("smith",2);
        System.out.println(student.name+" rank is "+student.getRank());

    }
}
