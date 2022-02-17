package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        boolean counter = true;
        int min = 200;
        int max = 300;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min)
                if (i * i <= max) {
                }
            count++;
        }
        System.out.println("Количество квадратов: " + count);
    }
}