public class HW_1 {
    public static void main(String[] args) {
        Employee[] PersArrey = new Employee[5];
        PersArrey[0] = new Employee("Peter Malakchov", 56,"manager", 4000,"halooimpeter@mailbox.com" , "+49333222444");
        PersArrey[1] = new Employee("Klaudia Gust", 34, "developer", 6000, "klaugust.2010@gamail.com", "+49000000000");
        PersArrey[2] = new Employee("Michael Kolb", 41, "speaker", 1500, "Michael.kolb@icloud.com", "+498888888889");
        PersArrey[3] = new Employee("Lina Zhalii", 23, "product menager", 2300, "zhalii.lino4ka@gmail.com", "+49222345789");
        PersArrey[4] = new Employee("Max Joe", 38, "speaker", 1500, "max.j@gmail.com", "+49789000000");

        for(Employee employee : PersArrey){
            if (Employee.getAge() > 40){
                System.out.println(employee);
            }
        }
    }


}
