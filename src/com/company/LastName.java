package com.company;

/**
 * Created by yboiko on 15.08.18.
 */
public enum LastName {
    Boiko(0),
    Khomenko(1),
    Kunin(2),
    Matyashova(3),
    Socur(4),
    Ivanov(5);

    int value;

    LastName(int value) {
        this.value = value;
    }
}
