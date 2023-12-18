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
        return get(index,0);
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



}

