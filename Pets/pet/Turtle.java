package pet;

public class Turtle extends Pet {

    public Turtle(int hunger, int thirst, int energy) {
        super(hunger, thirst, energy);
        title = "Черепаха";
    }
    public void Voice() {
        if (hunger < 4 || thirst < 5 || energy < 1) {
            System.out.println("Ваш питомец чем-то недоволен. Сделайте его счастливым!");
        }
        else {
            System.out.println("Шшш-сссс-шшшшш!");
            hunger -= 4;
            thirst -= 5;
            energy -= 1;
        }
    }

    public void DipWater() {
        if (hunger < 8 || energy < 8) {
            System.out.println("Ваш питомец чем-то недоволен. Сделайте его счастливым!");
        }
        else {
            System.out.println(title + " пошла купаться");
            hunger = energy -= 8;
            thirst += 5;
        }
    }
}
