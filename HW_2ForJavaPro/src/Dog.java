public class Dog extends Animal {

    public Dog(String name, String color, int age, int running, int swimming) {
        super(name, color, age, running, swimming);

    }
    @Override
    public String voice() {
        return "gav-gav";
    }

    @Override
    public String run() {
        if (running <= 500){
            return "Собака может пробежать это расстояние. " + name + " пробежал: " + running + " метров.";
        }else{
            return "К сожалению "+ name + " мне может пробежать так много";
        }
    }

    @Override
    public String swim() {
        if (swimming < 11){
            return "Собака может проплыть это расстояние. " + name + " проплыл: " + swimming + " метров.";
        }else{
            return "К сожалению "+ name + " мне может проплать так много";
        }
    }

}
