import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static List<Double> Numerics = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        count();
    }

    public static void count(){
        while (true){
            double NumNumeric = Numbers();
            Numerics.add(NumNumeric);
            double opSign = (double) operationsSign();
            if (opSign == '='){
                break;
            }else{
                System.out.println("Вы можете ввести только такие знаки как: +, -, *, /, =. ");
                operationsSign();
            }
            Numerics.add(opSign);
            double countedResult = countResult(Numerics);
            System.out.println(countedResult);
        }
    }

    public static char operationsSign(){
        System.out.println("Введите знак математической операции:");
        char sign = scanner.next().charAt(0);
        if(sign == '+'){
            return sign;
        } else if (sign == '-') {
            return sign;
        } else if (sign == '*') {
            return sign;
        } else if (sign == '/') {
            return sign;
        }
        return sign;
    }

    public static double Numbers() {
        System.out.println("Введите число:");
        double Num = scanner.nextDouble();
        return Num;
    }

    public static double countResult(List<Double> Numerics){
        double Result = Numerics.get(0);
        for (int i = 0; i < Numerics.size(); i += 2){
            double num = Numerics.get(i + 1);
            char operator = (char) Math.round(Numerics.get(i));
            if(operator == '+'){
                Result += num ;
            } else if (operator == '-') {
                Result -= num;
            } else if (operator == '*') {
                Result *= num;
            } else if (operator == '/') {
                Result /= num;
            }
        }
        return Result;
    }
}

