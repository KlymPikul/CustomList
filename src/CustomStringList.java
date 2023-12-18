import java.util.Arrays;
public class CustomStringList {
    private String[] list;

    // Конструктор, принимающий массив строк и присваивающий его в свойство list
    public CustomStringList(String[] strings) {
        this.list = strings;
    }

    // Метод check для проверки наличия строки в списке строк
    public boolean check(String str) {
        for (String s : this.list) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }

    // Метод check для проверки наличия строк из списка в списке строк list
    public boolean checkline(String[] strings) {
        for (String str : strings) {
            if (!check(str)) {
                return false;
            }
        }
        return true;
    }

    // Метод longestWord для поиска самого длинного слова в массиве list
    public String longestWord() {
        String longest = "";
        for (String str : this.list) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    // Метод add для добавления новой строки в массив list
    public void add(String str) {
        String[] newList = Arrays.copyOf(this.list, this.list.length + 1);
        newList[newList.length - 1] = str;
        this.list = newList;
    }

    // Метод addIfNotExists для добавления новой строки, если ее нет в массиве list
    public void addIfNotExists(String str) {
        if (!check(str)) {
            add(str);
            System.out.println("Строка '" + str + "' успешно добавлена");
        } else {
            System.out.println("Строка '" + str + "' уже есть в массиве");
        }
    }

    // Дополнительный метод toString для вывода содержимого списка в виде строки
    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }
}
