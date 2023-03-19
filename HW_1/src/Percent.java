public class Percent {
    public static void main(String[] args) {
    double thingA = 1000;
        double thingB = 500;
        double discount = 100;
        double sum = thingA + thingB ;
        double price = (discount / sum) * 100;
        System.out.println("Процент скидки = " + price + "%" );

    }
}
