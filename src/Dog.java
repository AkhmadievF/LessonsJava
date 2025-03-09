public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    String getInfo(){
        return ("собаку зовут " + name +
                " породы: " + breed +
                " она весит: " + weight + " кг!");
    }
    void getRun(){
        int i = 0;
        while (speed!=i) {
            i++;
            System.out.println("я бегу " + speed +" раз");
        }
    }
}
