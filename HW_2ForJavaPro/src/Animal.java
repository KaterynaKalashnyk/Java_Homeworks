public abstract class Animal implements IAnimals {
    protected String name;
    protected String color;
    protected int age;
    protected int running;
    protected int swimming;

    public Animal(String name,
    String color, int age, int running, int swimming) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.running = running;
        this.swimming = swimming;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract String voice();
    public abstract String run();
    public abstract String swim();

}
