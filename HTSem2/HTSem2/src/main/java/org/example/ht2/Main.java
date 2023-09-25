package org.example.ht2;

public class Main {
    public static void main(String[] args) {
        try {
            int d = 0;
            int [] intArray = new int[9]; // не был объявлен массив intArray
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e){ // обработка исключения выхода за  пределы массива
            System.out.println("Выход за пределы массива");
        }

    }
}
