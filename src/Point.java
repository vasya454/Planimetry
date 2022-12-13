import static java.lang.Math.sqrt;

public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point otherP)
    {
        //return getDistance(this, otherP);
        return sqrt((otherP.x-x)*(otherP.x-x) +(otherP.y-y)*(otherP.y-y));

    }

    public static double getDistance(Point p1, Point p2)
    {
        return sqrt((p2.x-p1.x)*(p2.x-p1.x) +(p2.y-p1.y)*(p2.y-p1.y));
    }
}
