public class Books extends PrintEdition{
    private String ISBN;
    public Books(String number, String name, int price, String place, String ISBN) {
        super(number, name, price, place);
        this.ISBN = ISBN;
    }

    public boolean isAvaible(){
        if(getPrice() > 1000){
            return false;
        }else{
            return true;
        }
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Печатная серия{ " +
                "Номер: " + getNumber() + ", имя: "+ getName() +
                ", цена: " + getPrice() + ", место: " + getPrice() + ", ISBN: " +  getISBN() +
                ", книга досптупна:" + isAvaible() + "}";
    }

}
