package pet;

public class Rabbit extends Pet {

    public Rabbit(int hunger, int thirst, int energy) {
        super(hunger, thirst, energy);
        title = "Кролик";
    }

    public void Voice() {
        if (hunger < 5 || thirst < 5 || energy < 6) {
            System.out.println("Ваш питомец чем-то недоволен. Сделайте его счастливым!");
        }
        else {
            System.out.println("Фыр-фыр-фыр!");
            hunger = thirst -= 5;
            energy -= 6;
        }
    }

    public void MoveEars() {
        if (hunger < 1 || energy < 1) {
            System.out.println("Ваш питомец чем-то недоволен. Сделайте его счастливым!");
        }
        else {
            System.out.println(title + " пошевелил ушами");
            hunger = energy -= 1;
        }
    }
}
