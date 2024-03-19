import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void removeFruit(T fruit) {
        fruits.remove(fruit);
    }

    public void moveFruit(Box<T> box2) {
        box2.fruits.addAll(fruits);
        fruits.clear();
    }


}
