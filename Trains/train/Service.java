package train;

//Хозяйственный поезд
public class Service extends Trains {

    public Service(TypeTrains type, int countWagon, int fuel, int averageSpeed) {
        super(type, countWagon, fuel, averageSpeed);
    }

    public void Drive() {
        System.out.println("Хозяйственный поезд поехал. Чух-Чух-Чух!");
        System.out.println("Ремонтирую пути...");
        inTransit = true;
    }

    public void DeliverCargo (int distance) {
        if (inTransit == false) {
            double fuelCosts = distance / 100 * 5;
            if (fuel != 0 && fuelCosts < fuel) {
                System.out.println("Хозяйственный поезд поехал доставлять груз. Чух-Чух-Чух!");
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
