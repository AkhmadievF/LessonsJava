package interfaces;

public class Dog extends Animal implements Runable{
    @Override
    public void eat() {
        System.out.println("Собачий корм");
    }
    @Override
    public void run(){
        System.out.println("Собака бегит");
    }
}
