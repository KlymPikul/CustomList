import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

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
    }
}



        /*
        CustomList customList = new CustomList(new int[]{1, 2, 3, 4, 5, 13, 6, 16});
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







