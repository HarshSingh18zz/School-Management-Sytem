package School_System;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // two teacher and student objects created
        Teacher liz = new Teacher("Liz",2000,1);
        Teacher sara= new Teacher ("Sara",4000, 2);
         Student Raj= new Student(1,"Raj",4);
         Student Raza= new Student(2, "Raza",5);

        ArrayList<Teacher> teacherlist= new ArrayList<>();// addition of two teachers in array list
        teacherlist.add(liz);
        teacherlist.add(sara);
        ArrayList<Student>studentlist=new ArrayList<>();//addition of two students in array list
        studentlist.add(Raj);
        studentlist.add(Raza);

         School gps = new School(studentlist,teacherlist);
             Raza.Feespaid(5000);
             Raj.Feespaid(6000);
             liz.recievesalary(liz.getSalary());
        System.out.print(gps.gettotalmoney(gps.getMoneyearned(), gps.getMoneyspent()));
    }
}
