import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	    //круг
        //квадрат
        //треугольник
        //прямоугольник
        //прямая
        //точка         1
        //отрезок

        Point A = new Point(-4, -3);
        Point B = new Point(0, 0);
        //double dist = Point.getDistance(B, A);
        double dist = B.getDistance(A);
        System.out.println(dist);

        System.out.println(B.getDistance(A));

        dist = A.getDistance(new Point(3,4));
        System.out.println(dist);

        Segment AB = new Segment(A, B);
        Segment CD = new Segment(1, 1, 2, 2);
    }

}
