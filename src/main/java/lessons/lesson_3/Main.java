package lessons.lesson_3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"asd", "ds", "ret", "123"};

        System.out.println("Задание 1\n" + "\n" + Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));


        List<String> list = convertToList(arr);
        System.out.println(list.getClass() + " : " + list + "\n");


        System.out.println("Задача\n");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
        System.out.println();

        Float orange1Weigth = orangeBox1.getWeight();
        Float orange2Weigth = orangeBox2.getWeight();
        Float appleWeigth = appleBox.getWeight();
        System.out.println("Первая коробка с апельсинами весит: " + orange1Weigth);
        System.out.println("Вторая коробка с апельсинами весит: " + orange2Weigth);
        System.out.println("Коробка с яблоками весит: " + appleWeigth + "\n");

        System.out.println("Сравнить вес первой коробки с апельсинами" +
                "и коробки с яблоками: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес второй коробки с апельсинами" +
                "и коробки с яблоками: " + orangeBox2.compare(appleBox) + "\n");

        orangeBox1.moveAt(orangeBox2);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }
}
