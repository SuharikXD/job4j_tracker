package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (true) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches <= 3) {
                turn = !turn;
                count -= matches;
                if (count <= 0) {
                    turn = !turn;
                    break;
                }
            }
            switch (count) {
                case 1 -> System.out.println("На столе осталось " + count + " спичка.");
                case 2, 3, 4 -> System.out.println("На столе осталось " + count + " спички.");
                default -> System.out.println("На столе осталось " + count + " спичек.");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}