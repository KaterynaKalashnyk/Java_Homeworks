import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        money(2300, 7.92);
    }
    public static double money(double amount, double EUR){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите сумму в USD");
//        double amount = scanner.nextDouble();
//        System.out.println("Введите курс");
//        double EUR = scanner.nextDouble();
//       return amount * EUR;
        System.out.println(amount * EUR);
        return amount;
    }
}
