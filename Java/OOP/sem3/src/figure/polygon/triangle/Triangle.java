package figure.polygon.triangle;

import figure.polygon.Polygon;

public class Triangle extends Polygon {
    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideC);

        if (!((sideA + sideB) > sideC &&
                (sideB + sideC) > sideA &&
                (sideC + sideA) > sideB)){
            throw new Exception("Треугольник с такими сторонами не может существовать.");
        }
    }

    @Override
    public double area() {
        double halfP = this.perimeter() / 2;
        return Math.sqrt(halfP * ((halfP - this.sides.get(0)) * (halfP - this.sides.get(1)) * (halfP - this.sides.get(2))));
    }

}
