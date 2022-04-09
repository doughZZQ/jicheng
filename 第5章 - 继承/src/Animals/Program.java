package Animals;

public class Program
{
    public static void main(String[] args)
    {
        Animal a1 = new Cat("大白", "白");
        a1.eat();
        a1.description();
        Cat c = (Cat) a1;
        c.setColor("灰");
        c.description();
        a1.description();

        System.out.println();

        Animal a2 = new Dog("小黑", "拉布拉多");
        a2.eat();
        a2.description();
        Dog d = (Dog) a2;
        d.setVariety("金毛");
        a2.description();
        d.description();
    }
}
