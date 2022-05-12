package day43_Abstraction.employeeTask;

public final class Driver extends Employee {

    public Driver(String name, int age, char gender, int id, String jobtitle, double salary) {
        super(name, age, gender, id, jobtitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }
}
