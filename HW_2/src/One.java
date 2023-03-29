import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите словo 1");
        String str1 = scanner.nextLine();
        if (str1.length() % 2 == 0){
            System.out.println("Сomplete");
        }else{
            System.out.println("Введите другое слово");
        }
        System.out.println("Введите словo 2");
        String str2 = scanner.nextLine();
        if (str2.length() % 2 == 0){
            System.out.println("Сomplete");
        }else{
            System.out.println("Введите другое слово");
        }
        String str3 = str1.substring(0, 3) + str2.substring(4);
        System.out.println("Новое слово");
        System.out.println(str3);
    }

}
