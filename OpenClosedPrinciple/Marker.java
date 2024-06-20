package OpenClosedPrinciple;

//Open/Closed Principle : Open for extension but close for modification.
public class Marker {
    String name ;
    String colour;
    int year ;
    int price;
    public Marker(String name, String colour, int year, int price) {
        this.name = name;
        this.colour = colour;
        this.year = year;
        this.price = price;
    }
}
