package route;

public class Route {
    private String output;
    private String input;
    private int distance;

    public Route(String output, String input, int distance) {
        this.output = output;
        this.input = input;
        this.distance = distance;
    }
    public void Print() {
        System.out.println("ИЗ " + output + " ДО " + input + "; Расстояние: " + distance);
    }

    public int getDistance() {
        return distance;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }
}
