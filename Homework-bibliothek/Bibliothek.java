import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    public static void main(String[] args){
        List<PrintEdition> catalog = new ArrayList<>();
        catalog.add(new Books("UA198657", "Аліса в задзеркаллі", 470, "145UA24-5", "ISBN1.0"));
        catalog.add(new Magazines("US1457830", "VOGUE", 1987, "MA34-4", 2020, "US5638"));
        System.out.println(catalog);
    }
}
