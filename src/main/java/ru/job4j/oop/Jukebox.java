package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox songs = new Jukebox();
        songs.music(1);
        songs.music(2);
        songs.music(3);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
