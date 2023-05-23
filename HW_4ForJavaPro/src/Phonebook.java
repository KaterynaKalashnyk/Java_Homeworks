public class Phonebook {
    private String name;
    private String number;

    public Phonebook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
