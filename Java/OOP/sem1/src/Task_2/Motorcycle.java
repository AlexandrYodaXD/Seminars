package Task_2;

public class Motorcycle extends Vehicle{
    public Motorcycle(String model, String color, int wheels, double weight, int speed) {
        super(model, color, wheels, weight, speed);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
