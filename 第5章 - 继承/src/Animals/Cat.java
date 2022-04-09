package Animals;

public class Cat extends Animal
{
    private String color;

    public Cat(String name, String color)
    {
        super(name);
        this.color = color;
        this.getName();
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    @Override
    public void eat()
    {
        System.out.println("吃猫粮。");
    }

    @Override
    public void description()
    {
        System.out.println("我叫" + getName() + ", 是一只" + color + "猫。");
    }

    public void shuMao()
    {
        System.out.println("给猫梳毛。");
    }
}
