package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> test = new HashMap<>();
        test.put("SuharikXD@yandex.ru", "Зыков Данил Александрович");
        test.put("parsentev@yandex.ru", "Arsentev Petr Sergeevich");
        for (String key : test.keySet()) {
            String value = test.get(key);
            System.out.println(key + " : " + value);
        }
    }
}
