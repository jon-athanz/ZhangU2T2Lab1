public class Point
{
    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int side) {
        x = side;
        y = side;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "Quadrant I";
        } else if (x < 0 && y > 0) {
            quadrant = "Quadrant II";
        } else if (x < 0 && y < 0) {
            quadrant = "Quadrant III";
        } else if (x > 0 && y < 0) {
            quadrant = "Quadrant IV";
        } else if (x == 0 && y < 0 || y > 0) {
            quadrant = "on an axis";
        } else if (x < 0 || x > 0 && y == 0) {
            quadrant = "on an axis";
        } else {
            quadrant = "origin";
        }
        return quadrant;
    }
}
