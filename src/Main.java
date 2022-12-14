import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //круг
        //квадрат
        //треугольник
        //прямоугольник
        //прямая
        //точка         1
        //отрезок

//        Point A = new Point(-4, -3);
//        Point B = new Point(0, 0);
//        //double dist = Point.getDistance(B, A);
//        double dist = B.getDistance(A);
//        System.out.println(dist);
//
//        System.out.println(B.getDistance(A));
//
//        dist = A.getDistance(new Point(3,4));
//        System.out.println(dist);
//
//        Segment AB = new Segment(A, B);
//        Segment CD = new Segment(1, 1, 2, 2);
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(4, 0);
        Triangle abc = new Triangle(a, b, c);
        System.out.println(abc.getPerimeter());
        System.out.println(abc.getArea());
//        Generator.trianglesByPointsToFile("triangles.txt", 10);
//        ArrayList<Triangle> trs = Triangle.getFromFile("triangles.txt");
//        for (Triangle tr : trs) {
//            System.out.println("Периметр треугольника: " + tr.getPerimeter());
//            System.out.println("Площадь треугольника: " + tr.getArea());
//        }
        Generator.segmentsByPointsToFile("segments.txt",7);
        ArrayList<Segment> ss = Segment.getFromFile("segments.txt");
        for (Segment s : ss) {
            System.out.println("Отрезок длиной " + s.getLength());
        }
    }
}
