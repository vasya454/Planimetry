public class Segment {
    Point start, finish;

    public Segment(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public Segment(double x1, double y1, double x2, double y2) {
        start = new Point(x1, y1);
        finish = new Point(x2, y2);
    }

    public double getLength()
    {
        //return start.getDistance(finish);
        return Point.getDistance(start, finish);
    }
    
}
