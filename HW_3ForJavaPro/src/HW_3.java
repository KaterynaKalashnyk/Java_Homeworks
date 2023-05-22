public class HW_3 {
    /**
     * Java. Homework #4
     * @author Kateryna
     * @version 22.05.2023
     * Я, к сожаления, не смогла сделать раньше, потому что я приболела.
     * Так же я проанализировала код с урока и к сожалению, у меня появилась проблема с
     * методом eat. Я пробовала подобраться к нему по разному, но в первом цикле он все равно
     * светиться красным.Вы бы могли указать в чем ошибка*/
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat(30, "Barsik"), new Cat(15, "Alisa"), new Cat(20, "Tima")
        };
        Plate plate = new Plate(50, 70);
        System.out.println(plate);
        System.out.println("Cat ate");

        for (Cat cats : cat){
            cat.eatFood(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        plate.addFood(15);
        System.out.println(plate);
        for (Cat cat : cat){
            cat.setFullness(false);
            cat.eatFood(plate);
        }
    }

}
