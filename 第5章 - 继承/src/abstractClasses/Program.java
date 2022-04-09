package abstractClasses;

/**
 * This program demonstrates abstract classes.
 *
 */

public class Program
{
    public static void main(String[] args)
    {
        Person[] people = new Person[2];

        people[0] = new Employee("员工01", 23, 30000);
        Employee e = (Employee) people[0];
        e.raiseSalary(20);
        people[1] = new Student("学生01", 15, "计算机科学");

        for (Person p : people)
        {
            System.out.println(p.getName() + ", age " + p.getAge() + ", " + p.getDescription());
        }
    }
}
