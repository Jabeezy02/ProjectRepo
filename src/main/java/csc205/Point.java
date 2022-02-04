package csc205;

public class Point {

double x;
double y;
double distance;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public void setPoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public Point(double x,double y){
        setPoint(x, y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.x = x;
    }





    public double distance(Point b) {
        return Math.sqrt(((this.x - b.getX())*(this.x - b.getX())) + ((this.y - b.getY())*(this.y - b.getY())));
    }

    public void rotate(double rotation) {
        this.x = ((x * Math.cos(0)) - (y * Math.sin(0)));
        this.x = ((x * Math.sin(0)) + (y * Math.cos(0)));
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void shiftX(int i) {
        this.x += i;
    }

    public void shiftY(int i) {
        this.y += i;
    }


}

