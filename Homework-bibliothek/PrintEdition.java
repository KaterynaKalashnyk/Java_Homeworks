public abstract class PrintEdition {
    private String number;
    private String name;
    private int price;
    private String place;

    public PrintEdition(String number, String name, int price, String place) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }
}
