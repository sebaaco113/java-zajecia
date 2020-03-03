import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Human {
    public  String firstName;
    public String lastName;
    protected Phone mobile;
    public Animal pet;
    private Double salary = 1000.0;
    private Car car;
    Double budget = salary * 0.4;


    public Double  getSalary() {
        return salary;
    }
    public void raiseMySalary(){


        this.salary *= 1.1;
    }
    public Car getCar(){
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}