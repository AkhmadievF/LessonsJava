//public class MyArrayList {
//
//    String[] array = new String[10];
//    int size = 0;
//
//    public void add(String element) {
//        array[size] = element;
//        size++;
//        if (size == array.length) {
//            String[] newArray = new String[array.length * 2];
//
//            for (int i = 0; i < size-1; i++) {
//                newArray[i] = array[i];
//            }
//            array = newArray;
//        }
//    }
//    public void remove(int index){
//        for (int i = index; i < size; i++){
//            array[i] = array[i+1];
//
//        }
//        array[size] = null;
//        size--;
//    }
//    public void remove(String element) {
//        for (int i = 0; i < size; i++) {
//            if (element == array[i]) {
//                remove(i);
//            }
//        }
//    }
//
//
//    public int getSize(){
//        return size;
//    }
//
//    public String get(int index){
//        return array[index];
//    }
//
//}
