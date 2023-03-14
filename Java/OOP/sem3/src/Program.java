import figure.circle.Circle;
import figure.Figure;
import figure.polygon.Polygon;
import figure.polygon.rectangle.Rectangle;
import figure.polygon.square.Square;
import figure.polygon.triangle.Triangle;

/*
На языке программирования Java реализовать классы следующих геометрических фигур:
1.Треугольник
2.Прямоугольник
3.Квадрат
4.Круг
У каждой из этих фигур реализовать методы вычисления периметра и площади этих фигур.
Так же для каждой фигуры реализовать проверку на корректность данных при создании фигуры,
то есть можем ли мы начертить такой треугольник с заданными стонами или квадрат или прямоугольник.
Так же круг может существовать только с радиусом больше нуля. Использовать эти классы в main и проверить все методы и
конструкторы классов.
 */
public class Program {
    public static void main(String[] args) throws Exception {
        Figure[] figures = new Figure[]{
                new Rectangle(4, 5), // периметр 18, площадь 20
                new Square(5), // периметр 20, площадь 25
                new Triangle(7, 14, 10),
                new Circle(7)
        };

        System.out.println(((Polygon) figures[0]).perimeter());
        System.out.println(figures[0].area());
        System.out.println(((Polygon) figures[1]).perimeter());
        System.out.println(figures[1].area());
        System.out.println(((Polygon) figures[2]).perimeter());
        System.out.println(figures[2].area());
        System.out.println(((Circle) figures[3]).circumference()); // длина окружности
        System.out.println(figures[3].area());
    }
}
