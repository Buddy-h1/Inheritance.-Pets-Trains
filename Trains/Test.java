import java.util.Scanner;
import route.Route;
import train.*;

public class Test {

    public static void PrintMenuTrainSelection() {
        System.out.println("[1] - Пассажирский поезд;");
        System.out.println("[2] - Грузовой поезд;");
        System.out.println("[3] - Хозяйственный поезд;");
    }

    public static void PrintMenuActionsTrain() {
        System.out.println("[1] - Отправить поезд;");
        System.out.println("[2] - Вернуть поезд;");
        System.out.println("[3] - Заправить поезд;");
    }

    public static void main(String[] args) {
        Route[] routes = {new Route("Архангельск", "Тюмень", 2100),
                new Route("Брянск", "Челябинск", 2054),
                new Route("Волгоград", "Ярославль", 2000),
                new Route("Казань", "Пермь", 1800),
                new Route("Пенза", "Ростов-на-Дону", 1987)};

        Passenger passenger = new Passenger(TypeTrains.PASSENGER, 20, 100, 90, 500);
        Freight freight = new Freight(TypeTrains.FREIGHT, 16, 100, 90, 5000);
        Service service = new Service(TypeTrains.SERVICE, 10, 100, 30);

        int commandSel = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            PrintMenuTrainSelection();
            commandSel = input.nextInt();
            int commandAct = 0;
            if (commandSel == 1) {
                PrintMenuActionsTrain();
                commandAct = input.nextInt();
                if (commandAct == 1) {
                    for (int i = 0; i < routes.length; i++) {
                        System.out.print("[" + i + "] ");
                        routes[i].Print();
                    }
                    System.out.println("Выберите маршрут: ");
                    int commandRoute = 0;
                    commandSel = input.nextInt();
                    passenger.Drive(routes[commandRoute]);
                    System.out.println("Топлива осталось: " + passenger.getFuel());
                } else if (commandAct == 2) {
                    passenger.Return();
                    System.out.println("Топлива осталось: " + passenger.getFuel());
                } else if (commandAct == 3) {
                    passenger.Refueling();
                    System.out.println("Топлива осталось: " + passenger.getFuel());
                } else return;
            }
            else if (commandSel == 2) {
                PrintMenuActionsTrain();
                commandAct = input.nextInt();
                if (commandAct == 1) {
                    for (int i = 0; i < routes.length; i++) {
                        routes[i].Print();
                    }
                    System.out.println("Выберите маршрут: ");
                    int commandRoute = 0;
                    commandSel = input.nextInt();
                    freight.Drive(routes[commandRoute]);
                    System.out.println("Топлива осталось: " + freight.getFuel());
                } else if (commandAct == 2) {
                    freight.Return();
                    System.out.println("Топлива осталось: " + freight.getFuel());
                } else if (commandAct == 3) {
                    freight.Refueling();
                    System.out.println("Топлива осталось: " + freight.getFuel());
                } else return;
            }
            else if (commandSel == 3) {
                PrintMenuActionsTrain();
                System.out.println("[4] - Доставить груз;");
                commandAct = input.nextInt();
                if (commandAct == 1) {
                    service.Drive();
                }
                else if (commandAct == 2) {
                    service.Return();
                }
                else if (commandAct == 3) {
                    service.Refueling();
                    System.out.println("Топлива осталось: " + service.getFuel());
                } else if (commandAct == 4) {
                    System.out.print("Расстояние: ");
                    int distance = input.nextInt();
                    service.DeliverCargo(distance);
                    System.out.println("Топлива осталось: " + service.getFuel());
                } else return;
            }
        }
    }
}
