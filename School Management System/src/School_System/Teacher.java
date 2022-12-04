package School_System;

public class Teacher {
    public String name;
    private  int salary;
    private  int teacherid;
    private int salaryearned;

    public Teacher( String Name,int salary,int teacherid)
    {
        this.name= Name;
        this.salary=salary;
        this.teacherid= teacherid;
        this.salaryearned= salary;
    }

    public String getName() {

        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void recievesalary(int salary) {
        salaryearned +=salary;
        School.updateMoneyspent(salary);
    }
}
