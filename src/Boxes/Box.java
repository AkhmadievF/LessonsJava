package Boxes;

public class Box {
    protected double length;
    protected double width;
    protected double height;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Box() {
        this(10);
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) {
        this(size, size, size);
    }
    Box (Box another){
        this(another.length, another.width, another.height);
    }


    public double getVolume() {
        return length * width * height;
    }

    public void showVolume() {
        System.out.println(getVolume());
    }

    public void showInfo(){
        System.out.println("Длина: "  + length);
        System.out.println("Ширина: "  + width);
        System.out.println("Высота: "  + height);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;

    }
    int compare(Box another){
        double currentBox = getVolume();
        double anotherBox = another.getVolume();
        int bool;
        if (currentBox>anotherBox){
            bool = 1;
        } else if (currentBox<anotherBox) {
            bool = - 1;
        }
        else bool = 0;
        return bool;
    }
        Box copy(){
        Box another = new Box(this.length, this.width, this.height);
            return another;
        }


        Box increase(){
        Box increaseBox = new Box(this.length*2, this.width *2, this.height*2);
        return increaseBox;
        }
}
