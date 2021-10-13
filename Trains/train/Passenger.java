package train;
import route.Route;

//Пассажирский поезд
public class Passenger extends Trains {
    private int countPlaces;
    private int countPeople;

    public Passenger(TypeTrains type, int countWagon, int fuel, int averageSpeed, int countPeople) {
        super(type, countWagon, fuel, averageSpeed);
        this.countPlaces = 34 * countWagon;
        this.countPeople = countPeople;
    }

    public void Drive(Route route) {
        if (inTransit == false) {
            double fuelCosts = averageSpeed * 0.01 + countPeople * 80 * 0.001 + route.getDistance() * 0.001;
            if (fuel != 0 && fuelCosts < fuel) {
                System.out.println("Пассажирский поезд поехал. Чух-Чух-Чух!");
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
