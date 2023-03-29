public class Two {
    public static void main(String[] args) {
    plus(90, 45);
    minus(78.9, 23.998);
    multiply(45, 23.7);
    division(9.2, 11);
    }
    public static void plus(double xNum, double yNum){
        System.out.println(xNum + yNum);
    }

    public static void minus(double xNum, double yNum) {
        if (xNum < yNum){
            System.out.println(yNum - xNum);
        }else{
            System.out.println(xNum - yNum);
        }
    }
     public static void multiply(double xNum, double yNum){
         System.out.println(xNum * yNum);
     }

    public static void division(double xNum, double yNum){
        System.out.println(xNum / yNum);
    }
}
