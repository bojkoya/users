package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        int size = 100;
        while (users.size() < size) {
            User user = new User();
            if (!users.contains(user)) {
                users.add(user);
            }
        }
        System.out.println(users);
        Collections.sort(users);
        System.out.println(users);


        List<Student> studentArrayList = new ArrayList<>();
        while (studentArrayList.size() < size) {
            Student student = new Student();
            if (!studentArrayList.contains(student)) {
                studentArrayList.add(student);
            }
        }
        System.out.println(studentArrayList);
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);
    }

}