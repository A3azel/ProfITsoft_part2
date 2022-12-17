package com.profITsoft.internship;

import com.profITsoft.internship.entity.User;

import java.util.List;

public class SimpleDB {
    public static List<User> userList = List.of(
            new User("User1", "Login1", "password1"),
            new User("User2", "Login2", "password2"),
            new User("User3", "Login3", "password3"),
            new User("User4", "Login4", "password4"),
            new User("User5", "Login5", "password5"),
            new User("User6", "Login6", "password6"),
            new User("User7", "Login7", "password7")
    );
}
