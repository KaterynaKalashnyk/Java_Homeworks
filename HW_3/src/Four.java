public class Four {
    public static void main(String[] args) {
    timeOnTheWork(12000);
    }
    public static void timeOnTheWork(double timeSec){
        if ((timeSec <= 28800) & (timeSec > 0)){
            double timeHour = timeSec / 3600;
            System.out.println("Осталось " + timeHour + " часов");
            System.out.println("Осталось " + timeSec + " секунд");
        }else{
            System.out.println("Введите число от 0 до 28800");
        }
    }
}
