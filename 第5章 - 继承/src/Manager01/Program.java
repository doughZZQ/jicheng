package Manager01;

public class Program
{
    public static void main(String[] args)
    {
        Manager boss = new Manager("员工01", 80000, 2002, 04, 18);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("员工02", 50000, 1989, 10, 01 );
        staff[2] = new Employee("员工03", 40000, 1990, 03, 15 );

        for (Employee e : staff)
        {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
    }
}
