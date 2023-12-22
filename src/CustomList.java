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



    public void reverse() {
        int i = 0;
        while (i < this.list.length / 2) {

            // Заменяем элементы
            int tmp = this.list[i];
            this.list[i] = this.list[this.list.length - 1 - i];
            this.list[this.list.length - 1 - i] = tmp;


            System.out.printf("после замены: %d - %d%n", this.list[i], this.list[this.list.length - 1 - i]);

            i++;
        }
    }


    public void bubbleSort(boolean desc) {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - i - 1; j++) {
                // Сравнение соседних элементов и обмен, если необходимо
                if ((desc && this.list[j] < this.list[j + 1]) || (!desc && this.list[j] > this.list[j + 1])) {
                    int temp = this.list[j];
                    this.list[j] = this.list[j + 1];
                    this.list[j + 1] = temp;
                    //swap(j, j + 1);
                }
            }
            System.out.println(this);
        }
    }

    // и==и - истина
    // л==и - ложь
    // и==л - ложь
    // л==л - истина
    public void selectionSort(boolean desk) {
        for (int i = 0; i < this.list.length; i++) {
            int max = this.list[0];
            int maxIndex = 0;
            for (int j = 0; j < this.list.length - i; j++) {
                if (max < this.list[j] == desk) {
                    max = this.list[j];
                    maxIndex = j;
                }
            }

            //swap(maxIndex, this.list.length - 1 - i);

            System.out.printf("max: %d (%d)%n", max, maxIndex);
        }


    }


    // HW_2 Реализовать приватный метод swap

    //Данный метод должен получить два целый числа в качестве аргументов и заменить местами значения с этими индексами в списке list.
    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < this.list.length && index2 >= 0 && index2 < this.list.length) {
            int temp = this.list[index1];
            this.list[index1] = this.list[index2];
            this.list[index2] = temp;
        } else {
            System.out.println("Некорректные индексы для замены.");
        }
    }

    public void invert() {
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] = -this.list[i];
        }
    }


    public void positive() {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] < 0) {
                this.list[i] = -this.list[i];
            }
        }
    }


    public void changeSign(boolean type) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] < 0 == type) {
                this.list[i] = -this.list[i];
            }
        }
    }

    public void insertionSort() {
        for (int i = 0; i < this.list.length; i++) {
            int key = this.list[i];
            int j = i - 1;

            while (j >= 0 && this.list[j] > key) {
                this.list[j + 1] = this.list[j];
                //System.out.printf("для %d: %d - %d\n", key, this.list[j], this.list[i]);
                j--;
            }
            this.list[j + 1] = key;
            System.out.printf("[%d)%d] %s%n", i, key, this);
        }
    }



    // HW_1. Напишите рекурсивный метод для вычисления суммы чисел от 1 до n.
    // n надо получить через аргументы.
    public int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + calculateSum(n - 1);
        }
    }
    // HW_2. Реализуйте метод, который умножает два числа с использованием рекурсии
    public int multiply(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiply(a, b - 1);
        } else {
            return -multiply(a, -b);
        }
    }

    // HW_3. Напишите рекурсивный метод для вычисления факториала числа.
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // HW_4. Напишите рекурсивный метод для печати чисел от 1 до n. n надо получить через аргументы.
    public void printNumbersRecursive(int n) {
        if (n >= 1) {
            printNumbersRecursive(n - 1);
            System.out.print(n + " ");
        }
    }

// HW_5. Напишите рекурсивный метод для печати чисел от n до 1.
// n надо получить через аргументы.

    public void printNumbersFromN(int n) {
        if (n >= 1) {
            System.out.print(n + " ");
            printNumbersFromN(n - 1);
        }
    }


}






















