public class Worker {
    String name;
    String position;
    double wages;
    Worker(String name, String position, double wages){
        this.name = name;
        this.position = position;
        this.wages = wages;
    }
    void showInfo(){
        System.out.println("Сотрудник " + name + ", должность: " + position + ", зарплата: " + wages);
    }
}


//public class MyArrayList2 {
//
//    private String[] array = new String[10];
//
//    private static int size = 0;
//
//    public String get(int index){
//        return array[index];
//    }
//
//    public void add(String element) {
//        array[size] = element;
//        size++;
//
//        if (size == array.length) {
//            String[] newArray = new String[array.length * 2];
//            for (int i = 0; i<array.length; i++){
//                newArray[i] = array[i];
//            }
//            array = newArray;
//        }
//
//    }
//
//    public int getSize() {
//        return size;
//    }
//}
//
