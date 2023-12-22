package test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(new int[]{10, 5, -8, -15, 3});
        int maxResult = test.get(true);
        System.out.println(maxResult);

        // Получение минимального значения
        int minResult = test.get(false);
        System.out.println(minResult);



/*
        Test test = new Test(12, 5);
        //System.out.println(test.max());

        System.out.println(test.get("max"));
        System.out.println(test.get("min"));

 */

    }
}
