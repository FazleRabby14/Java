
package point;

public class Line {
    private Point start;
    private Point end;
    
    Line(Point start, Point end)
    {
        this.start=start;
        this.end=end;
    }
    Line(int x1, int y1, int x2, int y2)
    {
        
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }
    public double length()
    {
        double len=start.distance(end);
        double dis=Math.sqrt(Math.pow(start.getY()-end.getY(),2)+ (Math.pow(start.getX()-end.getX(),2)));
        return len;
    }
}
