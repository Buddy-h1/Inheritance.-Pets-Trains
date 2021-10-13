package train;

public abstract class Trains {

    protected TypeTrains type;
    protected int countWagon;
    protected int fuel;
    protected int averageSpeed;
    boolean inTransit = false;

    public Trains(TypeTrains type, int countWagon, int fuel, int averageSpeed) {
        this.type = type;
        this.countWagon = countWagon;
        this.fuel = fuel;
        this.averageSpeed = averageSpeed;
    }

    public void Return() {
        if (inTransit) {
            inTransit = false;
            System.out.println("Поезд вернулся на станцию");
        }
    }

    public void Refueling() {
        fuel = 100;
    }

    public int getFuel() {
        return fuel;
    }
}
