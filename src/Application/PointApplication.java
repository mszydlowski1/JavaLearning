package Application;
import java.util.Scanner;
import logic.PointController;
import data.Point;

public class PointApplication {
    public static final int ADD_X = 1;
    public static final int MINUS_X = 2;
    public static final int ADD_Y = 3;
    public static final int MINUS_Y = 4;


    public static void main(String[] args)
    {
        System.out.println("Co chcesz zrobic z punktem?");
        System.out.println("1 - zwieksz x");
        System.out.println("2 - zmniejsz x?");
        System.out.println("3 - zwieksz y");
        System.out.println("4 - zmniejsz y");

        Scanner read = new Scanner (System.in);

        int a = read.nextInt();

        Point point = new Point(2, 3);
        PointController pc = new PointController();

        switch (a)
        {
            case ADD_X:
                pc.addX(point);
                System.out.println(point.getX());
                break;
            case MINUS_X:
                pc.minusX(point);
                System.out.println(point.getX());
                break;
            case ADD_Y:
                pc.addY(point);
                System.out.println(point.getY());
                break;
            case MINUS_Y:
                pc.minusY(point);
                System.out.println(point.getY());
                break;
            default:
                System.out.println("Zly wybor!!!");
        }
    }
}
