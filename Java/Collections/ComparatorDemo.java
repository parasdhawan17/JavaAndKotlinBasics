package Java.Collections;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class ComparatorDemo
{
    public static void main(String[] args){

        List<Student> studentList = new ArrayList<Student>();

        Student st = new Student(33,"Rumpa", 3.68);
        Student st2 = new Student(85,"Ashis", 3.85);
        Student st3 = new Student(56,"Samiha", 3.75);
        Student st4 = new Student(19,"Samara", 3.75);
        Student st5 = new Student(22,"Fahim", 3.76);
        studentList.add(st);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        Collections.sort(studentList,new Sortbyroll());


        for(Student stu: studentList){
            System.out.println(stu.getFname());
        }
    }

    static class Sortbyroll implements Comparator<Student>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Student a, Student b)
        {
            int compare = 0;

            if(a.getCgpa() > b.getCgpa()){
                compare = -1;
            }else if(a.getCgpa() <b.getCgpa()){
                compare = 1;
            }else {
                int stringcompare = a.getFname().compareTo(b.getFname());
                if(stringcompare==0){
                    if(a.getId()>b.getId()){
                        compare = -1;
                    }else if(a.getId()<b.getId()){
                        compare = 1;
                    }
                }else {
                    compare = stringcompare;
                }
            }
            return compare;
        }
    }
}



