public class Magazines extends PrintEdition{
    private int yearOfPublic;
    private String magazinesNumber;
    public Magazines(String number, String name, int price, String place, int yearOfPublic, String magazinesNumber) {
        super(number, name, price, place);
        this.yearOfPublic = yearOfPublic;
        this.magazinesNumber = magazinesNumber;
    }
    public boolean isAvaible(){
        if(getPrice() > 1000){
            return false;
        }else{
            return true;
        }
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    public String getMagazinesNumber() {
        return magazinesNumber;
    }

    @Override
    public String toString() {
        return "Печатная серия{ " +
                "Номер: " + getNumber() + ", имя: "+ getName() +
                ", цена: " + getPrice() + ", место: " + getPrice() + ", год публикации: " +  getYearOfPublic()
               + ", номер журнала:" + getMagazinesNumber() + ", книга досптупна:" + isAvaible() + "}";
    }
}
