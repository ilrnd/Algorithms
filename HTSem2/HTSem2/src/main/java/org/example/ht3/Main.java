package org.example.ht3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) /*throws Exception */{ // обработка исключений здесь излишняя, все через try/catch

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
            /*} catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");*/ // не нужная обработка общего исключения.
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (RuntimeException ex) {
            System.out.println("Деление на ноль не допустимо");
        }
    }
    public static void printSum(Integer a, Integer b) throws /*FileNotFoundException */ NullPointerException{
        /* мы не работаем с файлом, исключение излишне, не понятно зачем использутются классы-обертки, но если необходимо
        то нужно использовать исключение так как объект Integer может быть null*/
        System.out.println(a + b);
        throw new NullPointerException("Передан объект null");
    }

}
