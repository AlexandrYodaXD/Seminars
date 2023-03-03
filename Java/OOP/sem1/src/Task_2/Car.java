package Task_2;

public class Car extends Vehicle{
    public Car(String model, String color, int wheels, double weight, int speed) {
        super(model, color, wheels, weight, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}
