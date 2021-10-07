package Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentInfo implements Comparable<StudentInfo>{
    private int id;
    private String fname;
    private double cgpa;
    public StudentInfo(int id, String fname, double cgpa) {
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

    @Override
    public int compareTo(StudentInfo b) {
        int compare = 0;

        if(this.getCgpa() > b.getCgpa()){
            compare = -1;
        }else if(this.getCgpa() <b.getCgpa()){
            compare = 1;
        }else {
            int stringcompare = this.getFname().compareTo(b.getFname());
            if(stringcompare==0){
                if(this.getId()>b.getId()){
                    compare = -1;
                }else if(this.getId()<b.getId()){
                    compare = 1;
                }
            }else {
                compare = stringcompare;
            }
        }
        return compare;
    }
}

//Complete the code
public class ComparableDemo {
    public static void main(String[] args) {

        List<StudentInfo> studentList = new ArrayList<StudentInfo>();

        StudentInfo st = new StudentInfo(33, "Rumpa", 3.68);
        StudentInfo st2 = new StudentInfo(85, "Ashis", 3.85);
        StudentInfo st3 = new StudentInfo(56, "Samiha", 3.75);
        StudentInfo st4 = new StudentInfo(19, "Samara", 3.75);
        StudentInfo st5 = new StudentInfo(22, "Fahim", 3.76);
        studentList.add(st);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        Collections.sort(studentList);


        for (StudentInfo stu : studentList) {
            System.out.println(stu.getFname());
        }
    }
}



