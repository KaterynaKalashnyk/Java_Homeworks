public class LessonThree {
//    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", "black", 3);
//        System.out.println(cat.voice());
//        System.out.println(cat);
//
//        Dog dog = new Dog("Tuzik", "brown", 5);
//        System.out.println(dog.voice());
//        System.out.println(dog);
//
//    }

    public static void main(String[] args) {
        Animal[] animals = {new Cat("Barsik", "black", 3, 100, 30),
                new Dog("Tuzik", "brown", 5, 340, 3)};

        for(Animal animal : animals) {
            System.out.println(animal.voice());
            System.out.println(animal);
            System.out.println(animal.run());
            System.out.println(animal.swim());
        }

    }
}
