package train;
import route.Route;

//Грузовой поезд
public class Freight extends Trains {
    private int ladung;

    public Freight(TypeTrains type, int countWagon, int fuel, int averageSpeed, int ladung) {
        super(type, countWagon, fuel, averageSpeed);
        this.ladung = ladung;
    }

    public void Drive(Route route) {
        if (inTransit == false) {
            double fuelCosts = averageSpeed * 0.01 + ladung * 80 * 0.0001 + route.getDistance() * 0.001;
            if (fuel != 0 && fuelCosts < fuel) {
                System.out.println("Грузовой поезд поехал. Чух-Чух-Чух!");
                fuel -= fuelCosts;
                if (fuel < 0) fuel = 0;
                inTransit = true;
                System.out.println("Поезд прибыл в точку назначения!");
            }
            else System.out.println("Топлива не хватает!");
        }
        else System.out.println("Верните поезд на свою станцию");
    }
}
