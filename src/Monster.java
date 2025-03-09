public class Monster {
    double eyes;
    double hands;
    double legs;

    Monster(){
    this(2);
    }
    Monster(double count){
        this(count, count, count);
    }

    Monster(double eyes, double hands, double legs){
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;

    }
    void voice(){
        voice(1);
    }
    void voice(int count){

            voice(count,"Grrrrrrrr....");
    }
    void voice(int count, String word){
        for (int i = 0; i<count; i++){
            System.out.println(word);
        }
    }
}
