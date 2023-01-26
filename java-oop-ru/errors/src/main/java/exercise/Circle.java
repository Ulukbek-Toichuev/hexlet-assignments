package exercise;

// BEGIN
public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    // s = 3.14 * (r * r)
    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare()throws NegativeRadiusException{
        if (radius >=0){
            return 3.1415 * (radius * radius);
        }else{
            throw new NegativeRadiusException("Не удалось посчитать площадь\nВычисление окончено");
        }
    }
}
// END
