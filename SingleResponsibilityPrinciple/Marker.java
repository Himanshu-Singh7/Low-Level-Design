package SingleResponsibilityPrinciple;

//Single Responsibility Principle : A class should have only 1 reason to change
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
