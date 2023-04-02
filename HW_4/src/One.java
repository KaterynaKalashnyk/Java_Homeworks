import java.math.RoundingMode;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        figure();
    }
    public static String figure(){
        System.out.println("Введите название фигуры");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equalsIgnoreCase("треугольник")){
            System.out.println("S = sqrt(p*(p-a)*(p-b)*(p-c))");
            dreieck();
        }else if (str.equalsIgnoreCase("круг")) {
            System.out.println("S = Pi * r^2");
            ring();
        }else if (str.equalsIgnoreCase("прямоугольник")){
            System.out.println("S = a * b");
            rectangle();
        }
        return str;
    }

    public static double dreieck(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону а");
        double a = scanner.nextDouble();
        System.out.println("Введите сторону b");
        double b = scanner.nextDouble();
        System.out.println("Введите сторону c");
        double c = scanner.nextDouble();
        double perimetr = (a + b + c) / 2;
        double flache_dreieck = Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * perimetr - c);
        double result_dreieck = Math.ceil(flache_dreieck);
        System.out.println(result_dreieck);
        return flache_dreieck;
    }

    public static double ring (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус откружности");
        double r = scanner.nextDouble();
        double flache_ring = Math.PI * (r * r);
        double result_ring = Math.ceil(flache_ring);
        System.out.println(result_ring);
        return flache_ring;
    }

    public static double rectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторну а");
        double a = scanner.nextDouble();
        System.out.println("Введите сторну b");
        double b = scanner.nextDouble();
        double flache_rectangle = a * b;
        double result_rectangle = Math.ceil(flache_rectangle);
        System.out.println(result_rectangle);
        return flache_rectangle;
    }
}

