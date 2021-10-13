package pet;

public class Cat extends Pet {

    public Cat(int hunger, int thirst, int energy) {
        super(hunger, thirst, energy);
        title = "Кошка";
    }

    public void Voice() {
        if (hunger < 1 || thirst < 2 || energy < 3) {
            System.out.println("Ваш питомец чем-то недоволен. Сделайте его счастливым!");
        }
        else {
            System.out.println("Мяу-мяу-мяу!");
            hunger -= 1;
            thirst -= 2;
            energy -= 3;
        }
    }

    public void PlayWithBall() {
        if (hunger < 10 || energy < 10 || thirst < 12) {
            System.out.println("Ваш питомец чем-то недоволен. Сделайте его счастливым!");
        }
        else {
            System.out.println(title + " играет с мячом");
            hunger = energy -= 10;
            thirst -= 12;
        }
    }
}
