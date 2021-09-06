package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int middle) {
        return middle > max(left, right) ? middle : max(left, right);
    }

    public static void main(String[] args) {
        int rsl = Max.max(21, 22);
        int rsl1 = Max.max(21, 22, 33);
        System.out.println(rsl1);
    }
}
