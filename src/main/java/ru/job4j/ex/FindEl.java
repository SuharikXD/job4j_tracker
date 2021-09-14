package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws UserInputException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new UserInputException("Unknown index");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"1", "2", "3"};
        String key = "4";
        try {
            System.out.println(indexOf(value, key));
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
