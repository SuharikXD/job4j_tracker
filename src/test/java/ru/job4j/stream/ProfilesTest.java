package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenCollectFourAdress() {
        List<Profile> profiles = List.of(
                new Profile(new Address("Екатеринбург", "Ленина", 34, 12)),
                new Profile(new Address("Пермь", "Победы", 1, 44)),
                new Profile(new Address("Челябинск", "Избирателей", 44, 3)),
                new Profile(new Address("Тюмень", "Космонавтов", 8, 66))
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Екатеринбург", "Ленина", 34, 12));
        expected.add(new Address("Пермь", "Победы", 1, 44));
        expected.add(new Address("Тюмень", "Космонавтов", 8, 66));
        expected.add(new Address("Челябинск", "Избирателей", 44, 3));
        assertThat(rsl, is(expected));
    }
}