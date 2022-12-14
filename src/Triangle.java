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
        return sideOne.getLength()+sideTwo.getLength()+sideThree.getLength();
    }

    public double getArea() {
        double area = 0.5 * ((one.x - three.x) * (two.y - three.y) - (two.x - three.x) * (one.y - three.y));
        if (area>=0) {
            return area;
        }
        else return -area;
    }
//    public static void main(String[] args) {
//    Point a = new Point(0,0);
//    Point b = new Point(0,3);
//    Point c = new Point(4,0);
//    Triangle abc = new Triangle(a,b,c);
//        System.out.println(abc.getPerimeter());
//        System.out.println(abc.getArea());
//    }
}
