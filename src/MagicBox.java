import java.util.Random;

public class MagicBox<T> {


    private T[] items;
    private int size;

    public MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];

    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;

    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                int box = items.length - i;
                throw new RuntimeException("Коробка не полная, осталось заполнить еще " + (box) + " ячейки.");

            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];

    }
}