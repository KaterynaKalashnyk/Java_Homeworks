public class Two {
    public static void main(String[] args) {
        canBuy(true, true);
    }
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen){
        if (isEdekaOpen == true){
            System.out.println("I can buy some, this is true!");
        } else if (isReweOpen == true) {
            System.out.println("I can buy some food, this is true!");
        }else{
            System.out.println("I can't buy food!");
        }
        return isEdekaOpen;
    }
}
