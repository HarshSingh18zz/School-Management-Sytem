package School_System;

import java.util.List;

public class School {
    public String Name;
    private List<Student> students;
    private List<Teacher>teachers;
    private static int Moneyearned;
    private static int Moneyspent;

    public School(List<Student>students,List<Teacher>teachers)
    {
        this.students= students;
        this.teachers=teachers;
        Moneyearned=0;
        Moneyspent=0;
    }

    public String getName() {
        return Name;
    }
    public List<Student> getStudents() {
        return students;
    }

    public void updatetStudents(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void updateTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public int getMoneyearned() {
        return Moneyearned;
    }

    public static void updateMoneyearned(int moneyearned) {
        Moneyearned += moneyearned;
    }

    public int getMoneyspent() {
        return Moneyspent;
    }

    public static void updateMoneyspent(int moneyspent) {
        Moneyspent +=moneyspent;
    }
    public int gettotalmoney(int Moneyearned,int Moneyspent )
    {
        return Moneyearned-Moneyspent;
    }
}
