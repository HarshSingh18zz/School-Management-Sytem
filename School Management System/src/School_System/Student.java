package School_System;

public class Student {

    private int Studentid;
    private String Name;
    private int feespaid;
    private int totalfees;
    private int grade;

    public Student(int Studentid, String Name, int grade)
    {
        this.Studentid= Studentid;
        this.Name= Name;
        this.grade= grade;
        this.feespaid=0;
        this.totalfees=30000;
    }
    public void fees(int fees)
    {
        feespaid= +fees;
    }
    public void grading(int grade)
    {
       this.grade = grade;
    }

    public String getName() {
        return Name;
    }

    public void Feespaid(int fees) {
        feespaid=+ fees;
        School.updateMoneyearned(feespaid);
    }

    public int getTotalfees() {
        return totalfees;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentid()
    {
        return Studentid;
    }
    public int remainingfees()
    {
        return totalfees-feespaid;
    }
}