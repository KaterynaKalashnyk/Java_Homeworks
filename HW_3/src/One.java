public class One {
    public static void main(String[] args) {
    Walking(false, false);
    }
    public static boolean Walking(boolean isWeekend, boolean isRain){
        if (isWeekend != isRain){
            boolean canWalk = true;
            System.out.println("You can walk!");
        }else{
            boolean canWalk = false;
            System.out.println("Stay at home!");
        }
        return isWeekend;
    }
}
