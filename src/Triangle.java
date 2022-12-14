import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
    Point one, two, three;

    public Triangle(Point one, Point two, Point three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public double getPerimeter() {
        Segment sideOne, sideTwo, sideThree;
        sideOne = new Segment(one, two);
        sideTwo = new Segment(two, three);
        sideThree = new Segment(three, one);
        return sideOne.getLength() + sideTwo.getLength() + sideThree.getLength();
    }

    public double getArea() {
        double area = 0.5 * ((one.x - three.x) * (two.y - three.y) - (two.x - three.x) * (one.y - three.y));
        if (area >= 0) {
            return area;
        } else return -area;
    }

    public static ArrayList<Triangle> getFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<Triangle> output = new ArrayList<>();
        String str = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                str += scanner.next() + " ";
            }
            scanner.close();
            Scanner s = new Scanner(str.replace('.', ','));
            while (s.hasNextDouble()) {
                Triangle triangle = new Triangle(new Point(s.nextDouble(), s.nextDouble()),
                        new Point(s.nextDouble(), s.nextDouble()),
                        new Point(s.nextDouble(), s.nextDouble()));
                output.add(triangle);
            }
            s.close();
        } catch (Exception e) {
            System.out.println("Something wrong");
        }
        return output;
    }

    public static void main(String[] args) {
//        Point a = new Point(0, 0);
//        Point b = new Point(0, 3);
//        Point c = new Point(4, 0);
//        Triangle abc = new Triangle(a, b, c);
//        System.out.println(abc.getPerimeter());
//        System.out.println(abc.getArea());
        Generator.trianglesByPointsToFile("triangles.txt", 10);
        ArrayList<Triangle> trs = Triangle.getFromFile("triangles.txt");
        for (Triangle tr : trs) {
            System.out.println("Периметр треугольника: " + tr.getPerimeter());
            System.out.println("Площадь треугольника: " + tr.getArea());
        }
    }
}
