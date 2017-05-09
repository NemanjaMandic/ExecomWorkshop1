package com.example.nemus.execomworkshop1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.nemus.execomworkshop1.R;
import com.example.nemus.execomworkshop1.adapter.UserAdapter;
import com.example.nemus.execomworkshop1.dao.UserDao;
import com.example.nemus.execomworkshop1.model.User;
import com.example.nemus.execomworkshop1.protocol.UserSelectedListener;
import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by nemus on 08-May-17.
 */

public class MainActivity extends AppCompatActivity implements UserSelectedListener {

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);

        Fresco.initialize(this);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView)
                findViewById(R.id.recycler_view);

        // recycler view can stack items vertically or horizontally
        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false));

        final UserAdapter adapter = new UserAdapter(this, UserDao.fetchUsers(), this);
        recyclerView.setAdapter(adapter);

        final FloatingActionButton fab =
                (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(MainActivity.this, NewUserActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public void userSelected(User user) {


    }
}