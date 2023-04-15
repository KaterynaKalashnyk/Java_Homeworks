public class two {
    public static void main(String[] args) {
        System.out.println(fromRomToAr("XVI"));
    }
    public static int toGetRoman(char romanNum){
        for (int i = 0; i <= romanNum; i++){
            if ('I' == romanNum){
            return 1;
            } else if ('V' == romanNum) {
            return 5;
            } else if ('X' == romanNum) {
            return 10;
            } else if ('L' == romanNum) {
            return 50;
            } else if ('C' == romanNum) {
            return 100;
            } else if ('D' == romanNum) {
            return 500;
            } else if ('M' == romanNum) {
            return 1000;
        }
        }
        return 0;
    }
    public static int fromRomToAr(String RomToArab){
        int end = RomToArab.length()-1;
        char[] arNum = RomToArab.toCharArray();
        int arabian;
        int result = toGetRoman(arNum[end]);

        for(int i = 0; i < end; i--){
            arabian = toGetRoman(arNum[i]);

            if (arabian < toGetRoman(arNum[i + 1])){
                result -= arabian;
            }else{
                result += arabian;
            }
        }
        return result;
    }
}