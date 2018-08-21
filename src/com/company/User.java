package com.company;

import java.util.Random;

/**
 * Created by yboiko on 15.08.18.
 */
public class User implements Comparable<User> {

    protected FirstName firstName;
    protected LastName lastName;
    protected int age;

    private static Random random = new Random();

    User() {
        this.firstName = FirstName.values()[random.nextInt(FirstName.values().length)];
        this.lastName = this.lastName.values()[random.nextInt(this.lastName.values().length)];
        this.age = random.nextInt(10) + 18;
    }

    @Override
    public int compareTo(User user) {
        int result = Integer.compare(lastName.value, user.lastName.value);
        if (result == 0) {
            result = Integer.compare(firstName.value, user.firstName.value);
        }
        if (result == 0) {
            result = Integer.compare(age, user.age);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return age == user.age && firstName == user.firstName && lastName == user.lastName;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                lastName +
                " " + firstName +
                ", " + age +
                " years old}\n";
    }
}
