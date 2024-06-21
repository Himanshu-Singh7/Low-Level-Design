package LiskovSubstitutionPrinciple;

public class MoterCycle implements Bike{

    boolean isEnginOn;
    int speed;

    @Override
    public void turnOnEngine() {
        // turn on engine
        isEnginOn = true;
    }

    @Override
    public void accelerate() {
        // increase the speed
        speed = speed + 10;
    }
}
