import java.util.Random;

public class MagicBox<T> {

    protected T[] items;

    public MagicBox(int maxNumber) { //  конструктор
        items = (T[]) new Object[maxNumber];
    }

    boolean add(T item) { // Метод добавления объекта
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {//метод проверки заполнения коробки
        for (int i = 0; i < items.length; i++) {
        if (items[i] == null) { //поиск пустых ячеек в коробке
            throw new RuntimeException("Коробка не полна, осталось заполнить ещё " + (items.length - i));// выполнение условия, если коробка имеет пустые ячейки
            }
        }
        Random random = new Random(); //выполнение условия, если в коробке нет пустых ячеек
        int randomInt = random.nextInt(items.length);//создание случайного числа
        return items[randomInt]; //возврат случайного числа
    }
}





