package ru.job4j.collection.PassportOffice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        Citizen citizen = null;
        for (String c : citizens.keySet()) {
            if (c.contains(passport)) {
                citizen = citizens.get(c);
                break;
            }
        }
        return citizen;
    }
}