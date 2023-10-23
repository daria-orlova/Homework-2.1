package Zadania;

public class Zadanie8 {
    public static void main(String[] args) {
        Integer[] value8 = {3, 4};
        changeValue(value8);
        for (int i : value8)
            System.out.println(i);

    }
    public static void changeValue(Integer[] value8){
        value8[0] = 99;
    }
}
