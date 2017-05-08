package com.example.nemus.execomworkshop1.dao;

import com.example.nemus.execomworkshop1.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nemus on 08-May-17.
 */

public class UserDao {

    public static List<User> fetchUsers(){
        final List<User> users = new ArrayList<>();
        for(int i=0; i < 43; i++){
            users.add(new User( i % 2 == 0 ? "Aco" : "De",
                                i % 2 == 0 ? "Kahriman" : "Luxa",
                                i % 2 == 0 ? "https://scontent.fbeg1-1.fna.fbcdn.net/v/t1.0-9/13939448_1243959982302720_6450874697649704721_n.jpg?oh=a68a3f871da3141b1996a1fbc53272fd&oe=5985E6DC"
                                           : "https://scontent.fbeg1-1.fna.fbcdn.net/v/t1.0-9/13887031_10207302609584377_5387584509816705867_n.jpg?oh=710659a6aa6da2b821a394d7580b9c2d&oe=59BCF9AC"));
        }
        return users;
    }
}
