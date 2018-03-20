package Application;
import logic.PointController;
import data.Point;

public class PointApplication {

    public static void main(String[] args)
    {
        Point point = new Point(2, 3);
        PointController pc = new PointController();

        pc.addX(point);
        System.out.println(point.getX());
        pc.minusX(point);
        System.out.println(point.getX());
        pc.addY(point);
        System.out.println(point.getY());
        pc.minusY(point);
        System.out.println(point.getY());

    }
}
