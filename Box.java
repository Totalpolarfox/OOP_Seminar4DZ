import java.util.ArrayList;
import java.util.Random;

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

    public float getTotalWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void generateFruits(T fruit) {
        Random random = new Random();
        int units = random.nextInt(10, 25);
        for (int i = 0; i < units; i++) {
            addFruit(fruit);
        }
    }

    public static boolean compareWeight(Box box1, Box box2) {
        return box1.getTotalWeight() == box2.getTotalWeight();
    }

}
