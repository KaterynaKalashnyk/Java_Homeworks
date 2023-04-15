import java.util.HashMap;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        System.out.println(romanToDecimal("XXI"));
    }

    public static int romanToDecimal(String romanNumeral){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int end = romanNumeral.length()-1;
        char[] arNum = romanNumeral.toCharArray();
        int arNumbers;
        int result = map.get(arNum[end]);
        for(int i = end-1; i <= end; i--){
        arNumbers = map.get(arNum[i]);


            if (arNumbers < map.get(arNum[i+1])){
                result -= arNumbers;
            }else{
                result += arNumbers;
            }
            return result;
        }

        return end;
    }
}
