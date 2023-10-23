package Zadania;

public class Zadanie7 {

    public static void main(String[] args) {
        Integer[] value7 = {3, 4};
        changeValue(value7);
        for (int i : value7)
            System.out.println(i);
    }

    public static void changeValue(Integer[] value7) {
        value7 = new Integer[]{1, 2};
    }
}
