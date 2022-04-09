package abstractClasses;

public class Employee extends Person
{
    private double salary;

    public Employee(String name, int age, double salary)
    {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        salary *= (1 + (byPercent / 100));
    }

    @Override
    public String getDescription()
    {
        return "a employee with a salary of " + salary;
    }
}
