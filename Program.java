
    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

public class Program {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox1.generateFruits(new Apple());
        appleBox2.generateFruits(new Apple());
        orangeBox1.generateFruits(new Orange());
        orangeBox2.generateFruits(new Orange());

        System.out.println("Вес коробки 1 (Apple): " + appleBox1.getTotalWeight());
        System.out.println("Вес коробки 2 (Apple): " + appleBox2.getTotalWeight());
        System.out.println("Вес коробки 1 (Orange): " + orangeBox1.getTotalWeight());
        System.out.println("Вес коробки 2 (Orange): " + orangeBox2.getTotalWeight());
        System.out.println();
        System.out.println("Сравнение веса: коробка 1 (Apple) и коробка 1 (Orange): " + Box.compareWeight(appleBox1, orangeBox1));
        System.out.println("Сравнение веса: коробка 1 (Apple) и коробка 2 (Orange): " + Box.compareWeight(appleBox1, orangeBox2));
        System.out.println("Сравнение веса: коробка 2 (Apple) и коробка 1 (Orange): " + Box.compareWeight(appleBox2, orangeBox1));
        System.out.println("Сравнение веса: коробка 2 (Apple) и коробка 2 (Orange): " + Box.compareWeight(appleBox2, orangeBox2));
        System.out.println();
        System.out.println("Пересыпаем фрукты из коробки 1 (Apple) в коробку 2 (Apple)");
        appleBox1.moveFruit(appleBox2);
        System.out.println("Вес коробки 1 (Apple) после перемещения: " + appleBox1.getTotalWeight());
        System.out.println("Вес коробки 2 (Apple) после перемещения: " + appleBox2.getTotalWeight());
        System.out.println();
        System.out.println("Пересыпаем фрукты из коробки 1 (Orange) в коробку 2 (Orange)");
        orangeBox1.moveFruit(orangeBox2);
        System.out.println("Вес коробки 1 (Orange) после перемещения: " + orangeBox1.getTotalWeight());
        System.out.println("Вес коробки 2 (Orange) после перемещения: " + orangeBox2.getTotalWeight());
         
    }

}
