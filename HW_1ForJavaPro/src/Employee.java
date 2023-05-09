public class Employee {
    private String NameAndFamilyname;
    private String JobTitel;
    private String EMail;
    private String TelefonNummer;
    private static int Age;
    private int salary;

    public Employee(String NameAndFamilyname, int Age, String JobTitel, int salary, String EMail, String TelefonNummer) {
        this.NameAndFamilyname = NameAndFamilyname;
        this.JobTitel = JobTitel;
        this.EMail = EMail;
        this.TelefonNummer = TelefonNummer;
        this.Age = Age;
        this.salary = salary;
    }

    public static int getAge() {
        return Age;
    }

    @Override

    public String toString(){
    return "Employee: " + NameAndFamilyname + ", " + Age + ", " + JobTitel + ", " + salary + ", " + EMail + ", " + TelefonNummer + ".";
}


}
