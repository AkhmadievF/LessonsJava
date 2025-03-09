public class Rectangle {
    int length;
    int width;

    void getSquare(int length, int width){
        this.length = length;
        this.width = width;
        System.out.println(param());

    }
    int param(){
        return length*width;
    }

}
