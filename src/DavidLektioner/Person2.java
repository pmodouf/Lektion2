package DavidLektioner;

import DavidLektioner.Person;

public class Person2 extends Person {


    public Person2(String namn, String adress, int alder, String jobb, double salary) {
        super(namn, adress, alder);
        this.jobb = jobb;
        this.salary = salary;
    }

    private String jobb = "";
    double salary = ' ';

    public String getJobb() {
        return jobb;
    }

    public void setJobb(String jobb) {
        this.jobb = jobb;
    }

    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;

    } public double newSalary () {
        return salary*1.1;
    }
}
