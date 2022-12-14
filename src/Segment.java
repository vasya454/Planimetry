import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

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

    public static ArrayList<Segment> getFromFile(String fileName) {
        File file = new File(fileName);
        ArrayList<Segment> output = new ArrayList<>();
        String str = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                str += scanner.next() + " ";
            }
            scanner.close();
            Scanner s = new Scanner(str.replace('.', ','));
            while (s.hasNextDouble()) {
                Segment segment = new Segment(new Point(s.nextDouble(), s.nextDouble()),
                        new Point(s.nextDouble(), s.nextDouble()));
                output.add(segment);
            }
            s.close();
        } catch (Exception e) {
            System.out.println("Something wrong");
        }
        return output;
    }
    
}
