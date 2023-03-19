public class Scanner {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        tryScanner(scanner);

    }
    static void tryScanner(java.util.Scanner scanner) {

        System.out.println("Enter number");
        int quadr = scanner.nextInt();
        System.out.println(quadr * quadr);

    }

}
