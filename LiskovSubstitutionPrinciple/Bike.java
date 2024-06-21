package LiskovSubstitutionPrinciple;

public interface Bike {

    // Liskov Substitution Principle : If  class B is subtype of class A then we should be able to replace object of A with B without Breaking the behaviour of Program.
    //** Subclass should be extended the capability of Parent class narrow it down.

    void turnOnEngine();
    void accelerate();

}
