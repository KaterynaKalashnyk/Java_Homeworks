public class Three {
    public static void main(String[] args) {
        machine(334, 60);
    }
    public static boolean machine(double temp1, double temp2){
        if ((temp1 > 100) & (temp2 < 100)){
            boolean workOfDevices = true;
            System.out.println(workOfDevices);
        }else{
            boolean workOfDevices = false;
            System.out.println(workOfDevices);
        }
        return false;
    }
}
