package LiskovSubstitutionPrinciple;

public class Cycle implements Bike{

    @Override
    public void turnOnEngine() {
        throw new AssertionError("There is no engine");
        // This is not possible because of Breaking the behaviours of Program.
    }

    @Override
    public void accelerate() {
      // do Something
    }
}
