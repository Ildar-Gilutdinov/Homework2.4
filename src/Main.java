public class Main {

    public static void main(String[] args) {
        System.out.println("Система выбора случайного объекта");
        MagicBox <String> magicBox = new MagicBox<>(4);
        System.out.println("Коробка полная " + magicBox.add("июнь"));
        System.out.println("Коробка полная " + magicBox.add("июль"));
        System.out.println("Коробка полная " + magicBox.add("август"));
        System.out.println("Коробка полная " + magicBox.add("сентябрь"));
        System.out.println("Коробка полная " + magicBox.add("октябрь"));
        System.out.println("Выбираем случайный элемент из коробки типа String: " + magicBox.pick());
        MagicBox <Integer> magicBox2 = new MagicBox<>(4);
        System.out.println("Коробка полная " + magicBox2.add(10));
        System.out.println("Коробка полная " + magicBox2.add(20));
        System.out.println("Коробка полная " + magicBox2.add(30));
        System.out.println("Коробка полная " + magicBox2.add(40));
        System.out.println("Коробка полная " + magicBox2.add(50));
        System.out.println("Выбираем случайный элемент из коробки типа Integer: " + magicBox2.pick());
        System.out.println("Программа завершина!");
    }
}
