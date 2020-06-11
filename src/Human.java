import devices.Car;
import devices.Phone;

public class Human extends Animal{
    public  String firstName;
    public String lastName;
    protected Phone mobile;
    public Animal pet;
    private Double salary = 1000.0;
    private Car car;
    Double budget = salary * 0.4;

    public Human() {
        super("Homo sapiens");
    }


    public Double  getSalary() {
        return salary;
    }
    public void raiseMySalary(){


        this.salary *= 1.1;
    }
    public Car getCar(){
        return car;
    }

    public static void setCar(Car car) {
        this.car = car;
    }
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}