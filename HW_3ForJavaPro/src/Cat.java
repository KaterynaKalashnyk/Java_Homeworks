public class Cat {
    private final int appetite;
    private boolean fullness;
    private String name;

    public Cat(int appetite, String name) {
        this.appetite = appetite;
        this.name = name;
        fullness = false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setFullness(boolean status) {
        fullness = status;
    }


    public void eatFood(Plate plate) {
        if (!fullness){
            fullness = plate.minusfood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "appetite=" + appetite +
                ", fullness=" + fullness +
                ", name='" + name + '\'' +
                '}';
    }
    //    public static void fullnessOfCat () {
//        Plate.getFood();
//        int remainder = food - appetite;
//        if (remainder < 0) {
//            System.out.println("Коту не хватает еды");
//            System.out.println(food);
//        }else{
//            Plate Plate = new Plate(remainder);
//            System.out.println("Plate{" +
//                    "food=" + remainder +
//                    '}');
//        }
//    }
}
