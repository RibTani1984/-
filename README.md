# Решение задачи по созданию магической коробки

## Класс MagicBox (англ. магическая коробка), который умеет выбирать случайным образом один из сохранённых в него объектов.

1. ***Создадим метод public boolean add (T item)***

 ```
  public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;

    }
  ```

2. ***Реализуем метод public T pick()***

```
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
   ```

## Добавление класса Main

**В Main продемонстрируем работу класса, создав для этого магическую коробку для строк и вторую для чисел и продемонстрируем на них работу методов.**


### [Ссылка проекта по адресу](https://github.com/RibTani1984/Dgeneriki.git)