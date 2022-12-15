public class Circle extends Figure{
    Point center;
    double radius;
    public Circle (Point point, double r) {
        center = point;
        radius = r;
    }


    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
