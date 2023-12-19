import java.util.Arrays;
public class CustomList {
    private int[] list;

    public CustomList(int[] numbers) {
        this.list = numbers;
    }

    public CustomList() {
        this.list = new int[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }

    public int indexOf(int number) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int number) {
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index, int defaultValue) {
        if (index >= 0 && index < this.list.length) {
            return this.list[index];
        } else {
            return defaultValue;
        }
    }

    public int get(int index) {
        return get(index, 0);
    }

    public void add(int element) {
        int[] newList = new int[this.list.length + 1];
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }

        // Добавление нового элемента в конец newList
        newList[newList.length - 1] = element;

        // Присвоение newList в list
        this.list = newList;

    }

    public int getMax() {

        int max = this.list[0];
        for (int elem : this.list) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public int pop() {

        int lastElement = this.list[this.list.length - 1];
        int[] newList = Arrays.copyOf(this.list, this.list.length - 1);
        this.list = newList;

        return lastElement;
    }

    private void copyArray(int[] init, int[] result) {
        int[] shorter = (init.length > result.length) ? result : init;

        for (int i = 0; i < shorter.length; i++) {
            result[i] = init[i];
        }
    }

    // Метод remove, удаляющий первое вхождение указанного значения из массива.
    // Использует метод shiftByIndex для сдвига элементов и pop для удаления последнего элемента.
    public void remove(int value) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }

    // Метод remove2, удаляющий первое вхождение указанного значения из массива,
    // используя метод indexOf для поиска индекса.
    public void remove2(int value) {
        int index = indexOf(value);
        if (index != -1) {
            shiftByIndex(index);
            pop();
        }
    }

    // Метод removeRight, удаляющий последнее вхождение указанного значения из массива.
    public void removeRight(int value) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
    }

    //Метод removeAll, удаляющий все вхождения указанного значения из массива.
    public void removeAll(int value) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
            }
        }
    }

    public void removeAll2(int value) {
        int i = 0;
        while (i < this.list.length) {
            if (this.list[i] == value) {
                shiftByIndex(i);
                pop();
            } else {
                i++;
            }
        }
    }

    // removeAll2(int value): java public void removeAll2(int value){ int i = 0; while (i < this.list.length){ if (this.list[i] == value){ shiftByIndex(i); pop(); }else{ i++; } } }

    // Метод removeAll2, удаляющий все вхождения указанного значения из массива,
    //используя цикл while и методы shiftByIndex и pop.

      private void shiftByIndex(int index) {
       for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];
     }
     }
    //Вспомогательный метод shiftByIndex, сдвигающий элементы массива влево начиная с указанного индекса.


    // HW. Task1. Реализация метода removeByIndex для удаления элемента по индексу в пользовательском списке (CustomList).
    public void removeByIndex(int index) {
        if (index >= 0 && index < this.list.length) {
            shiftByIndex(index);
            int[] newList = Arrays.copyOf(this.list, this.list.length - 1);
            this.list = newList;
        } else {
            System.out.println("Некорректный индекс для удаления элемента.");
        }
    }

    // HW Task2. Реализация метода removeAllByIndex для удаления всех элементов по индексу в пользовательском списке (CustomList).

    public void removeAllByIndex(int index) {
        if (index >= 0 && index < this.list.length) {
            int valueToRemove = this.list[index];

            // Сдвигаем элементы и удаляем все вхождения значения
            int newSize = 0;
            for (int i = 0; i < this.list.length; i++) {
                if (this.list[i] != valueToRemove) {
                    this.list[newSize] = this.list[i];
                    newSize++;
                }
            }

            // Обновляем размер массива
            int[] newList = Arrays.copyOf(this.list, newSize);
            this.list = newList;
        } else {
            System.out.println("Некорректный индекс для удаления элемента.");
        }
    }
}







