package Shapes;

public class Triangle extends Shape{
    double c;

    public double getC() {
        return c;
    }

    public Triangle(double a, double b, double c ) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return getA()+getB()+getC();
    }
}
