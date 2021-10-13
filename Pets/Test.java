import pet.*;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(100, 100, 100);
        cat.Voice();
        cat.PlayWithBall();
        cat.Status();
        cat.Feed();
        cat.Sleep();
        cat.Drink();
        cat.Status();
        cat.Voice();

        Rabbit rabbit = new Rabbit(10, 30, 10);
        rabbit.Voice();
        rabbit.MoveEars();
        rabbit.Sleep();
        rabbit.Voice();
        rabbit.Status();

        Turtle turtle = new Turtle(50, 50, 50);
        turtle.Voice();
        turtle.DipWater();turtle.Status();
        turtle.Feed();
    }
}
