public class Four {
    public static void main(String[] args) {
    kkal();
    }
    public static void kkal(){
        double kkal_1cm = 40;
        System.out.println("Пицца диаметр 28 см");
        double pizza28 = 3.14 * (14 * 14);
        double pizza28_kkal = pizza28 * kkal_1cm;
        System.out.println(pizza28_kkal + "kkal");

        System.out.println("Пицца диаметр 24 см");
        double pizza24 = 3.14 * (12 * 12);
        double pizza24_kkal = pizza24 * kkal_1cm;
        System.out.println(pizza24_kkal + "kkal");
    }
}
