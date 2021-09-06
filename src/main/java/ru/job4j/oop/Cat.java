package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;
    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Котика зовут:"+ " " + this.name);
        System.out.println("Он ел:"+ " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }

    public String sound() {
        String voice = "may-may";
        return voice;
    }
}