import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        CustomList customList = new CustomList(new int[]{4, -3, 15, -6, 13, 26, -5, 2});

        int n = 5;
        int sum = customList.calculateSum(n);
        System.out.println(sum);

        int result = customList.multiply(7, 3);
        System.out.println(result);

        int number = 5;
        int result2 = customList.factorial(number);
        System.out.println(result2);

        int num = 15;

        customList.printNumbersRecursive(num);
        System.out.println();

        customList.printNumbersFromN(9);

        //customList.changeSign(true);  // делаем все числа положительными
        //System.out.println(customList);

        //customList.changeSign(false);  // делаем все числа отрицательными
        //System.out.println(customList);
        //customList.insertionSort();
       // System.out.println(customList);


        //customList.positive();
        //System.out.println(customList);

        // int[] numbers = {1, 2, 3, 4, 5};
        //CustomList customList = new CustomList(numbers);

        //System.out.println("Original list: " + customList);
        //customList.reverse();
        //System.out.println(customList);

        //customList.selectionSort(true);
        //System.out.println(customList);

        //customList.bubbleSort(false);
        //customList.bubbleSort(true);
       // customList.selectionSort();
        //System.out.println(customList);

        //customList.swap(5, 3);
        //System.out.println("результат " + customList);



        //System.out.println("После замены: " + customList);
        //customList.bubbleSort();

        //System.out.println("Original list: " + customList);
       // System.out.println(customList.reverse()); // Вывод равноудаленных от центра значений
    }


       // System.out.println("массив до удаления: " + customList);
       // customList.removeAllByIndex(2);
        //System.out.println("массив после удаления: " + customList);


        //int indexToRemove = 3;
        //customList.removeByIndex(indexToRemove);
        //customList.removeByIndex;
        //System.out.println("удаляем индекс(" + indexToRemove + "): " + customList);


    }


    /*

        //CustomList customList = new CustomList(new int[]{5, 8, 2, 10, 3});

        String[] initialStrings = {"Klym", "Maryna", "Nicol"};
        CustomStringList CustomStringList = new CustomStringList(initialStrings);

        System.out.println(CustomStringList);



        System.out.println(CustomStringList.check("Klym"));
        System.out.println(CustomStringList.check("Hayk"));

        String[] checkList = {"Maryna", "Nicol"};
        System.out.println(Arrays.toString(checkList) + ": " + CustomStringList.checkline(checkList));

        System.out.println("Longest Word: " + CustomStringList.longestWord());

        CustomStringList.add("Hayk");
        System.out.println("After adding 'Hayk': " + CustomStringList);

        CustomStringList.addIfNotExists("Klym");
        CustomStringList.addIfNotExists("Mark");

        System.out.println("Custom List: " + customList);
        System.out.println("Max Number: " + customList.getMax());


        System.out.println(customList.pop());
        //System.out.println("Popped Element: " + poppedElement);
        //System.out.println("Updated List: " + customList);
    }
}




/*CustomList customList = new CustomList(new int[]{1, 2, 3, 4, 5, 13, 6, 16});
        System.out.println(customList);
        System.out.println(customList.indexOf(3));
        System.out.println(customList.lastIndexOf(4));
        System.out.println(customList.get(13,0));
        //System.out.println(customList.get(13,2));
        customList.add(-3);
        customList.add(-3);
        customList.add(-3);
        customList.add(-3);



        System.out.println(customList.get(2, -1));
        System.out.println(customList.get(10, -1));

 */









