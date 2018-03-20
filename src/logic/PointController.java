package logic;
import data.Point;

public class PointController
{
     public void addX (Point p)
    {
        int x = p.getX();
        p.setX(++x);
    }
    public void minusX (Point p)
    {
        int x = p.getX();
        p.setX(--x);
    }
    public void addY (Point p)
    {
        int y = p.getY();
        p.setY(++y);
    }
    public void minusY (Point p)
    {
        int y = p.getY();
        p.setY(--y);
    }

}
