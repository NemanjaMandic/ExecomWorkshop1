package com.example.nemus.execomworkshop1.view;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.widget.TextView;


import com.example.nemus.execomworkshop1.model.User;
import com.example.nemus.execomworkshop1.protocol.UserSelectedListener;

/**
 * Created by nemus on 08-May-17.
 */

public class UserItemView {

    private User user;
    private final TextView firstName;
    private final TextView lastName;
    private final DrawerLayout.SimpleDrawerListener thumbnail;

    public UserItemView(Context context, UserSelectedListener userSelectedListener) {
    }
}
