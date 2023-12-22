package test;

public class Test {
    //переписать класс Test и создать свойство list
    // в конструкторе мы получаем в качестве аргумента массив и присваиваем в list
   // добавить метод max, который возвращает максимальное значение.
    private int[] list;
    // создать метод get который если получает в качестве аргумента true возвращает максимальное
// а если false, то минимальное
    public Test(int[] list) {
        this.list = list;
    }

    public int get(boolean type) {
        int result = this.list[0];

        for (int elem : this.list) {
                if (result < elem == type) {
                    result = elem;
                }
        }

        return result;
    }

    /*
    public int num1;
    public int num2;

    public Test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int get(String type) {
        if (this.num1 > this.num2 == type.equals("max")) {
            return num1;
        } else {
            return num2;
        }
    }

     */
}







