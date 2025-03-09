package Boxes;

public class WeightBox extends Box {
    protected double weight;


    public void setWeight(double weight) {
        this.weight = weight;
    }

    public WeightBox() {
        this.weight = 10;
    }

    public WeightBox(Box another, double weight) {
        super(another);
        this.weight = weight;
    }

    public WeightBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public WeightBox(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }

    @Override
    public double getVolume() {
        return super.getVolume() * weight;
    }

    @Override
    public void showVolume() {
        super.showVolume();
    }
}
