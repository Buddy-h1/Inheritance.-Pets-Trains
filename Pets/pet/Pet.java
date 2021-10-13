package pet;

public abstract class Pet {
    protected String title;
    protected final int MAX_HUNGER;
    protected final int MAX_THIRST;
    protected final int MAX_ENERGY;
    protected int hunger;
    protected int thirst;
    protected int energy;

    public Pet(int hunger, int thirst, int energy) {
        this.hunger = MAX_HUNGER = hunger;
        this.thirst = MAX_THIRST = thirst;
        this.energy = MAX_ENERGY = energy;
    }

    public void Voice() {
        System.out.println("Питомец издал звук!");
    }

    public void Feed() {
        hunger = MAX_HUNGER;
        System.out.println("Ням-ням-ням!");
    }

    public void Drink() {
        thirst = MAX_THIRST;
        System.out.println("питомец пьёт воду");
    }

    public void Sleep() {
        energy = MAX_ENERGY;
        System.out.println("Zzz-Zzz-Zzz");
    }

    public void Status() {
        System.out.println("************Голод: " + hunger);
        System.out.println("************Жажда: " + thirst);
        System.out.println("************Энергия: " + energy);
    }
}
