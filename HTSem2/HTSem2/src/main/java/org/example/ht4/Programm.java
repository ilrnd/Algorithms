package org.example.ht4;

import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */


public class Programm {

    public static String stringCheck(String str) {
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Введите корректную строку, строка не может быть пустой");
        }
        return str;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = stringCheck(scanner.nextLine());
        System.out.println("String is correct: " + str);
    }
}
