package abstractClasses;

public class Student extends Person
{
    private String major;

    /**
     * @param name the student's name
     * @param major the student's major
     */

    public Student(String name, int age, String major)
    {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getDescription()
    {
        return "a student majoring in " + major;
    }
}
