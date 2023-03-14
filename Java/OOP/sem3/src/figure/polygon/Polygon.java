package figure.polygon;

import figure.Figure;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure {
    protected List<Double> sides = new ArrayList<>();
    public double perimeter(){
        double sum = 0;
        for (double side : this.sides) {
            sum += side;
        }
        return sum;
    }
}
