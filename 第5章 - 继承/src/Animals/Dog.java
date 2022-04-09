package Animals;

public class Dog extends Animal
{
    //variety：种类
    private String variety;

    public Dog(String name, String variety)
    {
        super(name);
        this.variety = variety;
    }

    public void setVariety(String variety)
    {
        this.variety = variety;
    }

    @Override
    public void eat()
    {
        System.out.println("吃狗粮。");
    }

    @Override
    public void description()
    {
        System.out.println("我叫" + super.getName() + ", 是一只" + variety + "犬。");
    }
}
