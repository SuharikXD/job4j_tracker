package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("active: " + active);
        System.out.println("status: " + status);
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        Error err = new Error();
        Error err1 = new Error(true, 111, "Error 111");
        Error err2 = new Error(true, 404, "Error 404");
        Error err3 = new Error(false, 505, "Error 505");
        err.printInfo();
        err1.printInfo();
        err2.printInfo();
        err3.printInfo();
    }
}
