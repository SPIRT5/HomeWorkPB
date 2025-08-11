package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> nameToNumber = new HashMap<>();

    public int add(String name, String number) {
        nameToNumber.putIfAbsent(name, number);
        return nameToNumber.size();
    }
}
