import java.io.FileWriter;

public class Generator {
    public static void trianglesByPointsToFile(String fileName, int countOfTriangles) {
        try {
            if (countOfTriangles > 0) {
                FileWriter fileWriter = new FileWriter(fileName);
                for (int i = 0; i < countOfTriangles; i++) {
                    for (int j = 0; j < 6; j++) {
                        fileWriter.write(Math.round(((Math.random() - 0.5) * 2)*20*10.0)/10.0 + " ");
                    }
                    fileWriter.write("\n");
                }
                fileWriter.close();
            }
        }
        catch (Exception e) {
            System.out.println("Something wrong");
        }
    }

    public static void segmentsByPointsToFile(String fileName, int countOfSegments) {
        try {
            if (countOfSegments > 0) {
                FileWriter fileWriter = new FileWriter(fileName);
                for (int i = 0; i < countOfSegments; i++) {
                    for (int j = 0; j < 4; j++) {
                        fileWriter.write(Math.round(((Math.random() - 0.5) * 2)*20*10.0)/10.0 + " ");
                    }
                    fileWriter.write("\n");
                }
                fileWriter.close();
            }
        }
        catch (Exception e) {
            System.out.println("Something wrong");
        }
    }
}
